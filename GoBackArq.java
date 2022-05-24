import java.util.*;
import java.io.*;
import java.lang.*;
class Comms{
  int packet_no=0,ack_no=1,no_at_one_go,sender_pt=0;
int choice =1, temp_no_at_one_go;
int max=5000;
int min=1000;
  public void Send()throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  //  System.out.println("Total Packets");
  //  int no=Integer.parseInt(br.readLine());
    System.out.println("Window size?");
    no_at_one_go=Integer.parseInt(br.readLine());
  //no_at_one_go=Math.pow(2,no_at_one_go)-1;

while(true){

  int turn=(int)(Math.random()*max)+min;
   temp_no_at_one_go=no_at_one_go;


 if(ack_no%no_at_one_go==0 && ack_no>0){
   if(turn>=2000 && turn<=3000){
       System.out.println("Ack or packet loss occured... Resending");
       ack_no-=no_at_one_go;
       ErrorRecovery();
       continue;

   }
   else{
    System.out.println("Recieved ACK NO: "+ack_no);
    ack_no+=1;
    System.out.println("More packet to send? ");
    choice=Integer.parseInt(br.readLine());
    if(choice!=1)break;
    System.out.println("Sending Packet no "+(packet_no));
    packet_no+=1;
}
}
else{

System.out.println("Sending Packet no "+(packet_no));
 //if(packet_no%no_at_one_go==0)sender_pt=packet_no;
  if((packet_no+1)%no_at_one_go==0)Recieve();

packet_no+=1;
}
}


  }
  public void Recieve(){


    ack_no+=no_at_one_go-1;




  }

  public void ErrorRecovery(){
  /*  while(temp_no_at_one_go>0){
      System.out.println("Resending Packet no "+(sender_pt));
      temp_no_at_one_go-=1;
      sender_pt+=1;
  }
*/
int tempo=no_at_one_go;
int fake_ack=ack_no;
while(tempo>0){
    System.out.println("Resending Packet no "+(fake_ack));
    fake_ack+=1;
    tempo-=1;

}
ack_no+=no_at_one_go;
}

}
class GoBackArq{
  public static void main(String args[])throws IOException{
  System.out.println("Go back and ARQ for noisy channels");
  Comms obj=new Comms();
  obj.Send();

  }
}
