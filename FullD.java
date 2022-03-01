import java.io.*;
import java.util.*;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
public class FullD{
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
    System.out.println("Full Duplex\n");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true){
  System.out.println(" Do you wanna Enter new msg(0) or read the conversation(1)");

/*
  try {
      File myObj = new File("conversation.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    */


int choice =Integer.parseInt(br.readLine());
if(choice==0){

  System.out.println("Person1 or Person2");
  int person=Integer.parseInt(br.readLine());
  Comms obj1=new Comms();
  if(person==1)obj1.newMsg(1);
  else obj1.newMsg(2);
}
else {
    readConvo();
}
System.out.println("Continue? 0 to exit");
choice=Integer.parseInt(br.readLine());
if(choice == 0)System.exit(0);
else continue;
}


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
      myWriter.append("\nPerson "+person+": "+msg);

      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
