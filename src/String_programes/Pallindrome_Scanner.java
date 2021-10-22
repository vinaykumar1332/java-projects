/*write a program to print input is pallindrome are not*/

package String_programes;
import java.util.Scanner;
public class Pallindrome_Scanner
{
	
	public static void main(String[] args) 
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String ");
	String name=sc.next();
	 String actual=name; 
	 String rev=""; 
	 for(int i=actual.length()-1;i>=0;i--) 
	 { 
	 rev=rev+actual.charAt(i); 
	 } 
	 System.out.println("Actual String : "+actual); 
	 System.out.println("Reverse String : "+rev); 
	 if(actual.equals(rev)) 
	 { 
	 System.out.println("Given String is pallindrome"); 
	 }
	 else
	 System.out.println("Given String is not Pallindrome");
	}
	}




