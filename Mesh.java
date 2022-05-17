import java.io.*;
import java.util.*;
class Mesh{
  public static void readConvo(){
    try {
      File myObj = new File("conversation.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
public static void main(String [] args)throws IOException{
    System.out.println("Mesh Topo\n");
    int session=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do {

  System.out.println("Enter System no");

  int system_no=Integer.parseInt(br.readLine());



  System.out.println(" Do you wanna Enter new msg(0) or read the conversation(1)");
int choice =Integer.parseInt(br.readLine());
if(choice==0){



  Comms obj1=new Comms();
  obj1.newMsg(system_no);

}
else {
    readConvo();
}
System.out.println("Continue? 0 to exit");
choice=Integer.parseInt(br.readLine());
if(choice == 0)System.exit(0);
else continue;
}
while(true);

}
}
class Comms{
String msg="No msg yet";
 Comms()throws IOException{
     System.out.println("Enter msg");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     msg=br.readLine();
 }

 public void newMsg(int person){

   try {
   //  myWriter = new BufferedWriter(new FileWriter(my_file_name, true));
     FileWriter myWriter = new FileWriter("conversation.txt",true);
     myWriter.append("Person "+person+": "+msg+"\n");

     myWriter.close();
     System.out.println("Successfully wrote to the file.");
   } catch (IOException e) {
     System.out.println("An error occurred.");
     e.printStackTrace();
   }
 }
}
