import java.util.*;
import java.io.*;
import java.lang.Math;
class Try{
	public static void main(String args []){
  int max=100;
	int min=10;
	int limit=10;
	while(limit>0){
	int number=(int)(Math.random()*(max-min+1))+min;
	System.out.println(number);
	limit-=1;
}
	}

  }
