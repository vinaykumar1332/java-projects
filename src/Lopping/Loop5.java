/*write a program to print 1 to N natural numbers*/

package Lopping;

import java.util.Scanner;

public class Loop5 
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER YOUR LAST NUMBER");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
 }
}
