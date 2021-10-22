package String_programes;
import java.util.Scanner;

public class Replace_Scanner1 
{
	public static void main(String[]args)
		{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER YOUR STRING FOR REPALCE CHARACTER");
	  System.out.println(" Note : ENTER ONLY ONE TYPE CASE/{uppercase/lowercase}");
	  String input = sc.next();
	  System.out.println("ENTER YOUR CHARCTEAR ");
	  char i1 = sc.next(".").charAt(0);
	  System.out.println("ENTER YOUR CHRACTEAR FOR REPLACE");
	  char i2 = sc.next(".").charAt(0);
	  String s=input;
	  String s2=s.replace(i1,i2);
	  System.out.println(s2);
	  
	  }
	}

