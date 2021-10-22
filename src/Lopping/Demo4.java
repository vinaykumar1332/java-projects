package Lopping;

import java.util.Scanner;

public class Demo4
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR REMAINDER");
	int M=sc.nextInt();
	System.out.println("ENTER YOUR DIVIDE VALUE");
	int N=sc.nextInt();
	int rem=M;
	int temp=rem;
	for(int i=0;i<=temp;i++)
	{
		if(rem>=N)
		{
			rem=rem-N;	
		}
		else
		{
			System.out.println(i);
			break;
			}
	}
	System.out.println("REMAINDER  "+M+" IS DIVISIBLE BY "+N+" IS:"+rem);
	
}
}




