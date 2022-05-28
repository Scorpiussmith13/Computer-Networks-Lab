import java.util.*;
import java.io.*;
class Sender{
  public void Send(char ch){
    	System.out.println("\nSent"+ch);
  }
}



class Simplest{
		public static void main(String args[])throws IOException
{
		System.out.println("Welcome Sender!"+" Enter data to send:- ...");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
  Sender obj=new Sender();
for(int i=0;i<str.length();i++){
  	System.out.println("\n\nSending packet..."+str.charAt(i));
    obj.Send(str.charAt(i));

}



}






}
