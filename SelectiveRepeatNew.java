import java.util.*
import java.io.*;
import java.lang.*;
class Comms{
  int data;
  Comms(int data){
    this.data=data;
  }
public void Sender(){
  LinkedList<Integer> ll = new LinkedList<>();
  InsertNewNode(ll,data);
  CallingReciever(data);
  if(data==10){
    ShowLL(ll);
  }
}
public void InsertNewNode(LinkedList<Integer> ll,int data){
  ll.push_back(data);
}
private void CallingReciever( int data){
    LinkedList<Integer> ll2= new LinkedList<>();
    InsertNewNode(ll2,data);
    if(data==10){
      ShowLL(ll);
    }
}
public void ShowLL(LinkedList<Integer> ll){
  for(int i=0;i<ll.size();i++){
    System.out.print(ll.get(i)+" ");
  }

}
}
class SelectiveRepeatNew{
  public static void main(String args[]){
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Sender. Welcome!");
  for(int i=1;i<11;i++){
    Comms sd=new Sender(i);
    sd.Sender();

  }
}
}
