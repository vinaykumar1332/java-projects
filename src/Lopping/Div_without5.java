/*write a program numbers which are divisible by5 b/w M and N without using division operator*/
package Lopping;

import java.util.Scanner;

public class Div_without5 
{
 public static void main(String[]args)
 {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("ENTER YOUR  M VALUE");
	 int M=sc.nextInt();
	 System.out.println("ENTER YOUR N VALUE");
	 int N=sc.nextInt();
	 
	 for(int i=M;i<=N;i++)
	 {
		if(i>=N&&i<=M)
		{
			System.out.print(i);
		}
	 }
	 
 }
}
