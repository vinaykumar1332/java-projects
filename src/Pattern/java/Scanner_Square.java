package Pattern.java;

import java.util.Scanner;

public class Scanner_Square 
{
 public static void main(String[]args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Square value");
	 int n=sc.nextInt();
	 /*------looping-------*/
	 for(int i=1;i<=n;i++) {
		 for(int j=0;j<n;j++) {
			 System.out.print("$ ");
		 }
		 System.out.println(" ");
	 }
			 
			
 }
}
