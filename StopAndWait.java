import java.util.*;
import java.io.*;
import java.lang.Math;
class Comms{
String msg;
int turn;
Comms(int turn){
this.turn=turn;

}
public void  Sender()throws IOException{
  boolean ack;
  System.out.println("\n Welcome Sender...Enter Msg"+"  Sender prep to send...");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    msg=br.readLine();

  do{
     ack= Receiever();
  if(ack)System.out.println("Recieved Ack");
  else {
    System.out.println("Ack or packet loss occured... Resending");
      //boolean ack= Receiever();
}
}while(ack==false);
}
public boolean Receiever(){
  int max = 5000;
   int min = 1000;
   int range = max - min + 1000;
   turn = (int)(Math.random() * range) + min;
  try
 {
 Thread.sleep(turn);
 }
 catch(InterruptedException ex)
 {
     ex.printStackTrace();
 }
if(turn>2000 && turn<=3000) return false;
else return true;



}
}


class StopAndWait{
  public static void main(String args[])throws IOException{
  System.out.println("Stop and Wait for noiseless channels");
  Comms obj=new Comms(3000);
  obj.Sender();
  }

}
