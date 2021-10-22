package Standard_programs;

import java.util.Scanner;

public class Fibnocii_series1 
{
 public static void main(String[]args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER YOUR N VALUE");
	 int n =sc.nextInt();
	 int a=0;
	 int b=1;
	 
	 System.out.print(a+" "+b);
	 
	 for(int i=0;i<n;i++)
	 {
		System.out.print(" "+n);
		n=a+b;
		a=b;
		b=n;
	 }
	 
 }
}
