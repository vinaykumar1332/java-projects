package Lopping;
import java.util.Scanner;
public class Loop21 
{
   public static void main(String[]args)
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("ENTER YOUR DIVISIBLE NUMBER");
	   int m=sc.nextInt();
	   System.out.println("ENTER YOUR YOUR DIVIDE NUMBER");
	   int n=sc.nextInt();
	   if(m%n==0)
	   {
		   System.out.println("YOUR DIVISIBLE is DIVIDE NUMBER CHECK YOUR VALUES");
	   }
	   else
		   System.out.println("YOUR DIVISIBLE NOT DIVIDE NUMBER CHECK YOUR VALUES");
   }
}
