package String_programes;
import java.util.Scanner;

public class Index_Scanner1 
{
	static int n;
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR STRING VALUE");
	String s1 = sc.nextLine();
	System.out.println("ENTER YOUR INDEX VALUE");
	int i= sc.nextInt();
	
	//-------Looping-----//
	for(i=1;i>=n;i--)
	{
	String s=s1;
	System.out.println(s.charAt(i));
	break;
	}
 }
}

