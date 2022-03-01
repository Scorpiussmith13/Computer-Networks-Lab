import java.lang.*;
import java.io.*;
import java.util.*;
class Comms{
  static String msg="no msg yet";
  public void read(){
    System.out.println("last msg is "+msg);
  }
  public void record(String msg){
    this.msg=msg;
  }
}
class halfD{
public static void main(String[] args)throws IOException{


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//option=br.readLine();
System.out.println("Half-Duplex");
while(true){
  System.out.println("Person1 or Person 2?");

Comms obj2=new Comms();
Comms obj1=new Comms();
  int choice=Integer.parseInt(br.readLine());

  //Comms obj3=new Comms("NO msg yet");
  if(choice == 1){
    System.out.println("Welcome Person 1\n"+"Record mesg(0) or read last recieved msg(1)");
     int option=Integer.parseInt(br.readLine());
//    Comms obj1=new Comms();
    if(option == 0){
      System.out.println("Enter msg");
    String msg=br.readLine();
      obj1.record(msg);
    }
    else if(option==1)
        obj1.read();
  }
  else if(choice==2){
    System.out.println("Welcome Person 2\n"+"Record mesg(0) or read last recieved msg(1)");
 int option=Integer.parseInt(br.readLine());
//  Comms obj2=new Comms();
    if(option == 0){
          System.out.println("Enter msg");
        String msg=br.readLine();
        obj2.record(msg);
    }
    else if(option==1)
      obj2.read();


  }
  System.out.println("Continue? 0 to exit");
  choice=Integer.parseInt(br.readLine());
  if(choice == 0)System.exit(0);
  else continue;
  }
}

}
