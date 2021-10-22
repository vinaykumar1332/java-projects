package String_programes;
import java.util.Scanner;
public class Cont_Word_Scanner
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String value");
		String input =sc.next();
		System.out.println("Enter your Uppercase alphabet ");
		char C = sc.next(".").charAt(0);
		System.out.println("Enter your Lowercase alphabet");
		char c = sc.next(".").charAt(0);
		
		//-------main-------//
		String s=input; 
		 int count=0; 
		 for(int i=0;i<s.length();i++) 
		 { 
		 if(s.charAt(i)=='c'||s.charAt(i)=='C') 
		 { 
		 count++; 
		 } 
		 } 
		 System.out.println("Count of "+c+" and "+C+" : "+count); 
		}}
	

