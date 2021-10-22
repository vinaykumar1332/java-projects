/*write a program to print natural numbers in between M and N*/

package Lopping;

import java.util.Scanner;

public class Loop4 
{
  public static void main(String[]args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER FIRST NUMBER ");
	int m=sc.nextInt();
	System.out.println("ENTER YOUR LAST NUMBER ");
	int n=sc.nextInt();
	
	for(int i=m;i<=n;i++)
	{
		 System.out.println(i);
	}
  }
}


