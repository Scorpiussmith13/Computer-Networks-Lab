import java.lang.*;
import java.io.*;
import java.util.*;
class Encoding{
	String text;

	Encoding(String msg){
	text=msg;
	System.out.println("\n\n\nProcessing Packets...\nEntering Encrypting... \n");


	}
	String cypher(){ // ahh where to set up shop. Where is everyone hiding !!
		int n=7;
		while(n>0){
				//if(n==1)text+='0';
				if(n%2==1)text='1'+text;
				else text='0'+text;




		switch(n){
			case 1:

				System.out.println("Physical Layer "+text);
				break;

			case 2:
				System.out.println("Data link Layer "+text);
				break;



			case 3:
				System.out.println("Network Layer "+text);
				break;
			case 4:
				System.out.println("Transport Layer "+text);
				break;

			case 5:
				System.out.println("Session Layer "+text);
				break;


			case 6:
				System.out.println("Presentation Layer "+text);
				break;


			case 7:

				System.out.println("Application Layer "+text);
				break;



}
n--;
}

return text;
}
}

class Decoding{
String text,finalstring;
int finallength;
public int binToDec(String text)throws NumberFormatException{
	//int length=text.length();
	int no=Integer.parseInt(text,2);
	return no;
}
	Decoding(String msg,String finalstring,int finallength,int i){
	text=msg;
	this.finalstring=finalstring;
	System.out.println("\nEntering Decrypting... \n");
	this.finallength=finallength;

	Decypher(text,finalstring,finallength,i);



	}

void Decypher(String text,String finalstring,int finallength,int i) throws NumberFormatException{

		 StringBuilder str = new StringBuilder(text);
		String detext=new String();
		int n=6;
		System.out.println("Physical Layer "+str.toString());

		while(n>0){

				//if(n==7)detext=str.deleteCharAt(7).toString();
				 detext=str.deleteCharAt(0).toString();





		switch(n){




			case 6:
				System.out.println("Data link Layer "+detext);
				break;



			case 5:
				System.out.println("Network Layer "+detext);
				break;
			case 4:
				System.out.println("Transport Layer "+detext);
				break;

			case 3:
				System.out.println("Session Layer "+detext);
				break;


			case 2:
				System.out.println("Presentation Layer "+detext);
				break;


			case 1:

				System.out.println("Application Layer "+detext);
				break;



}
n--;
}
detext=str.deleteCharAt(0).toString();
System.out.println("The receieved bits are "+ detext);

int no=binToDec(detext.trim());
System.out.println("Recieved number is  "+ no );
char newstring=(char)no;

System.out.print("Receieved "+newstring);
if(i==finallength-1)System.out.println("\nString recieved "+finalstring);

}

}





class OSI{

static String intToBin(int no){
String nstr=" ";
String msg=" ";
char ch;
while(no>0){
	msg+=Integer.toString(no%2);
	no/=2;

}
 for (int i=0; i<msg.length(); i++)
      {
        ch = msg.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }

return nstr;

}

public static void main (String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String msg,finalstring;

		String thestring;
		int no=0;
		System.out.println("Welcome!"+" Enter your msg");

		thestring=br.readLine();
		for(int i=0;i<thestring.length();i++){
				no=(int)thestring.charAt(i);
				msg=intToBin(no);
				Encoding obj=new Encoding(msg);
				msg=obj.cypher();
				Decoding obj2=new Decoding(msg,thestring,thestring.length(),i);
		}

}




}
