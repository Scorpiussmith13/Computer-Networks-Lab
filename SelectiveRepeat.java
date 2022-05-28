import java.util.*;
import java.io.*;
import java.lang.*;
class LinkedList{

  class Node{

    int data;

    Node next;

  public  Node(int d){ //for new node creation

      d=data;
      next=null;

    }
  }

Node head=null;


public void InsertNewNode(int data){
    Node newNode=new Node(data);
  //  System.out.println("Inserting new node");
    if(head==null){
      head=newNode;
      head.next=null;
}
    else {
      Node temp =head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;
      newNode.next=null;
}

}

}
class Comms{
    LinkedList.Node ll,ll2;

    public void SendingPacket()throws IOException{
     //ll=new LinkedList;
     int i,data;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Sender. Welcome!");
    for(i=1;i<=10;i++){
//System.out.print(i);
 data=i;
int min=1000;
int max=2000;
int turn=(int)(Math.random()*max)+min;
if(i==10){
  System.out.println("Sender side");
  checkLL(ll);
  break;
}
if(turn >1500 && turn<=1800){
    ll.InsertNewNode(data);
  continue;

}
else{
  ll.InsertNewNode(data);
  RecievePacket(data);
}

}

}
public void RecievePacket(int data)throws IOException{
//ll2=new LinkedList();
//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
ll2.InsertNewNode(data);
if(data==10){
System.out.println("Reciever side");
  checkLL(ll2);

}
}

public void checkLL(LinkedList.Node ll){
  LinkedList.Node temp=ll.head; //object of LinkedList.Node type
  while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
  //System.out.println();

}

}


class SelectiveRepeat{
  public static void main(String args[])throws IOException{
  Comms sd=new Comms();
    sd.SendingPacket();

  }
}
