//*write a program to print  even numbers as user input*//
package Lopping;
import java.util.Scanner;

public class test2 
{
 public static void main(String[]args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER TO VERIFY EVEN OR NOT");
	int input=sc.nextInt();
	if(input%2==0)
	{
		System.out.println("YOUR NUMBER"+input+"IS EVEN NUMBER");
	}
	if(input%2==1)
	{
		System.out.println("YOUR NUMBER "+input+" IS ODD NUMBER");
	}
 }
}
