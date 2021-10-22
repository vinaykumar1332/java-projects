package Lopping;
import java.util.Scanner;


public class test1 
{
 public static void main(String[]args)
 {   
	 Scanner sc = new Scanner(System.in);
     System.out.println("ENTER YOUR STRING VLAUES");
     String s =sc.next();
     System.out.println("ENTER HOW MANY TIMES TO PRINT");
     int s1 = sc.nextInt();
	 int count = 1;
	 int sum=1;
	 for(int i=1;i<=s1;i++)
	 {
		System.out.println(count+")"+s);
	   count=sum+i;
	 }
	 
	
 }
}
