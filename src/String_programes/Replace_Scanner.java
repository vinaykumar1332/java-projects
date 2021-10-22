package String_programes;
import java.util.Scanner;

public class Replace_Scanner 
{
	public static void main(String[]args)
	{
		
	
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER YOUR STRING FOR REPALCE CHARACTER");
  String input = sc.next();
  String s=input;
  String s2=s.replace('i','m');
  System.out.println(s2);
  
  
}
}