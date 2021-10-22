package String_programes;
import java.util.Scanner;

public class Unique_Scanner 
{
      public static void main(String[] args) 
      { 
    	Scanner sc =new Scanner(System.in);
    	System.out.println("ENTER YOUR STRING WORD");
    	String input=sc.next();
    	
		String s=input; 
		String un=""; 
		for(int i=0;i<s.length();i++) { 
		char ch=s.charAt(i); 
		if(un.indexOf(ch)==-1) { 
		un=un+ch; 
		}} 
		System.out.println("Unique string is :"+un); 
		}
      } 

