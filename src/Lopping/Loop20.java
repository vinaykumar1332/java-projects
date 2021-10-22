/*write a program to print Given number is divisible by 4 or not?*/
package Lopping;

import java.util.Scanner;

public class Loop20 
{
  public static void main(String[]args)
  {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("ENTER YOUR NUMBER");
	 int n=sc.nextInt();
	 if(n%4==0) 
	 {
		System.out.println("YOUR NUMBER "+n+" IS DIVISIBLE BY 4"); 
	 }
	 else
		 System.out.println("YOUR NUMBER "+n+"IS NOT DIVISIBLE BY 4");
	}
}
