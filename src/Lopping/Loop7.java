package Lopping;
import java.util.Scanner;

public class Loop7 
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER YOUR ALPHABET");
		char c=sc.next().charAt(0);
		char count = 0;
	    
		for(char ch1=c;ch1<='z';ch1++)
		{
			System.out.println(ch1);
			count++;
			
		}
	    
		for(char ch=c;ch<='Z';ch++)
		{
			System.out.println(ch);
		}
		
		
		
		
	}

}
