import java.util.*;
import java.io.*;
import java.lang.*;
class Comms{
  int data;
  static ArrayList<Integer> ll=new ArrayList<>(),ll2=new ArrayList<>();
//  static ArrayList<Integer> ll2=new ArrayList<>();


public void Sender()throws IOException{
  int max=1000;
  int min=100;

    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  System.out.println("How many packets");
  int no_of_packets= Integer.parseInt(br.readLine());
  for(int i=1;i<=no_of_packets;i++){
        int turn=(int)(Math.random()*max)+min;
        data=i;
        System.out.println("Sending packet no "+i);
        InsertNewNode(data);
        if(turn>500 && turn<=700){
          CallingReciever(0);
          continue;
        }
      CallingReciever(data);

}
ShowLL(ll,ll2);
}
public void InsertNewNode(int data){
    ll.add(data);
}
public void InsertNewRNode(int data){
    ll2.add(data);
}
public void CallingReciever( int data){
//  ArrayList<Integer> ll2= new ArrayList<Integer>();
    InsertNewRNode(data);

}
public void ShowLL(ArrayList<Integer> ll,ArrayList<Integer> ll2){
  for(int i=0;i<ll2.size();i++){
      if(ll2.get(i)==0){
        System.out.println("Sending NAK for Packet no"+(i+1));
        System.out.println("Resending Packet no "+(i+1));
      }

  }

}
}
class SelectiveRepeatNew{
  public static void main(String args[])throws IOException{

  System.out.println("Sender. Welcome!");

    Comms sd=new Comms();
    sd.Sender();


}
}
