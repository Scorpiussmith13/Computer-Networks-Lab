import java.io.*;
import java.util.*;
class DoublyLinkedList {    
    
    class Node{  
        String item;  
        Node previous;  
        Node next;  
  
        public Node(String item) {  
            this.item = item;  
        }  
    }  
	
    Node head, tail = null;  
  
   
    public void addNode(String item) {  
        
        Node newNode = new Node(item);  
  
      	
        if(head == null) {  
            head = tail = newNode;  
    	    head.previous = null;  
            tail.next = null;  
        }  
        else {  
        
            tail.next = newNode;  
     	     newNode.previous = tail;  
             tail = newNode;  
             tail.next = null;  
        }  
   



 }  
public void Hop(){
DoublyLinkedList obj=new DoublyLinkedList();
if(head == null ){
     obj.head = obj.tail = head;  
     obj.head.previous = null;  
     obj.tail.next = null; 
}
else{
obj.addNode(head.item);

}





}


}

class hopToHop{

	
	public static void main(String args [])throws  IOException{
	DoublyLinkedList obj =  new DoublyLinkedList();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String msg;
int dist=0,i=1;
	System.out.println("Welcome Sender!\n");
	System.out.println("Enter your msg!");
	msg=br.readLine();	
	obj.addNode(msg);
	System.out.println("How far is reciever?\n");
	dist=Integer.parseInt(br.readLine());	
	
	while(dist>0){
	System.out.println("Hopped to device "+i++);
	obj.Hop();
	dist--;	
}	
System.out.println("Receiever recieved: "+obj.tail.item);


}



}
