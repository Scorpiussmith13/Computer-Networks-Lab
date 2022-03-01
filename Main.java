import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{




public static void main(String[] args)throws IOException{

System.out.println("Simplex");
while(true){
System.out.println("Sender or reciever?");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int choice=Integer.parseInt(br.readLine());
SendComms obj=new SendComms();
RecieveComms obj2=new RecieveComms();
//Comms obj3=new Comms("NO msg yet");
if(choice == 0){
obj.sender();
}
else {

  obj2.receiver();

}
System.out.println("Continue? 0 to exit");
choice=Integer.parseInt(br.readLine());
if(choice == 0)System.exit(0);
else continue;
}
}
}

class Comms{
public static String comman ="No msg yet";
  Comms(String comman){
    this.comman=comman;
  }
  Comms(){

  }

}

class  SendComms {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
private static String msg="";

public void sender()throws IOException{
System.out.println("Welcome Sender!");
System.out.println("Enter your msg!");
msg=br.readLine();
//Comms obj=new Comms(msg);
Comms.comman=msg;

}


}

class RecieveComms {

  public void receiver()throws IOException{
  System.out.println("Welcome Reciever!"+"\n"+"Do you wanna read the transmission?");

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int choice=Integer.parseInt(br.readLine());
  //Comms obj=new Comms("No m");
  if(choice==1){

  System.out.println("The msg is:- "  + Comms.comman) ;


}
  else {
  System.exit(0);


  }

  }
}
