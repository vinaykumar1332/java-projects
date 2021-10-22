package Lopping;

public class Remainder_WithoutusingDiv 
{
public static void main(String[]args)
{
	int rem=52;
	int temp=rem;
	for(int i=0;i<=temp;i++)
	{
		if(rem>=4)
		{
			rem=rem-4;	
		}
		else
		{
			System.out.println(i);
			break;
			}
	}
	System.out.println("REMAINDER OF 52 IS DIVISIBLE BY 4 IS:"+rem);
	
}
}
