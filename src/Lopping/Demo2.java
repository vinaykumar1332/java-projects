package Lopping;
import java.util.Scanner;

public class Demo2 
{
  public static void main(String[]args)
  {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("ENTER YOUR LOWEST VALUE");
	  int M=sc.nextInt();
	  System.out.println("ENTER YOUR HIGHEST VALUE");
	  int N=sc.nextInt();
	  System.out.println("ENTER YOUR INCREMENT NUMBER");
	  int I=sc.nextInt();
	  for(int i=M;i<=N;i+=I)
	  {
		if(i>M)
		{
		 System.out.println(i);	
		}
	  }
	  
  }
}
