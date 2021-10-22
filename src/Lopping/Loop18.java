/*write a program to print Multiplication table without using Multiple operator*/
package Lopping;

import java.util.Scanner;

public class Loop18
{
  public static void main(String[]args)
  {
	  Scanner ob =new Scanner(System.in);
	  System.out.println("ENTER YOUR NUMBER FOR MULTIPLICATION");
	  int n=ob.nextInt();
	  int sum=0;
	  for(int i=1;i<=10;i++) {
		for(int j=i;j<=i;j++) {
			sum=sum+n;
			}
		System.out.println(n+""+"*"+i+"="+n*i);
	  }
	  
	  
  }
}
