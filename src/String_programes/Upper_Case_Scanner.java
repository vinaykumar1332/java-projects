package String_programes;
import java.util.Scanner;
public class Upper_Case_Scanner 
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Lower String vlaue");
	String input=sc.next();
	String s1=input;
	String s2=s1.toUpperCase();
	System.out.println("Orginal String   : "+s1);
	System.out.println("Modified String  : "+s2);
	
  }
  
}
