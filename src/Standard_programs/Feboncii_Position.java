package Standard_programs;

import java.util.Scanner;

public class Feboncii_Position 
{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("ENTER THE POSITION VALUE");
	  int poss=sc.nextInt();
	  int n1=0;
	  int n2=1;
	  int n3=0;
	  int count =1;
	  if(poss==0)
	  {
		System.out.println("THE FEBONCII VALUE "+n1+" IS PRESENT IN "+poss);
	  }
	  else if(poss==1)
	  {
		System.out.println("THE FEBONCII VALUE "+n2+" IS PRESENT IN "+poss); 
	  }
	  else 
	  {
		for(int i=2;i<=poss;i++)
		{
			n3=n1+n2;
			count++;
			if(count==poss)
			{
				System.out.println("THE FEBONCII VALUE "+n3+" IS PRESENT IN "+poss);
			}
		}
	  }
  }
}
