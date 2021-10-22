/*write a program to print a table for user choices*/
package Lopping;

import java.util.Scanner;

public class Loop17 
{
	public static void main(String[]args)
	{
		Scanner ss =new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER FOR MULTIPLICATION");
		int n=ss.nextInt();
		System.out.println("ENTER YOUR LAST NUMBER FOR MULTPLICATION");
		int m=ss.nextInt();
		for(int i=1;i<=m;i++)
		{
		   System.out.println(n+""+"*"+i+"="+n*i);
		}
	}

}
