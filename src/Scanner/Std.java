package Scanner;

import java.util.Scanner;

public class Std 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER  FIRST LETTER IN YOUR NAME");
		String FN=s.nextLine();
		System.out.println("ENTER YOUR LAST LETTER IN YOUR NAME");
		String LN=s.nextLine();
		System.out.println("ENTER YOUR NAME");
		String NAME =s.nextLine();
		System.out.println("ENTER YOUR MARTIAL STATUS");
		String MS =s.nextLine();
		System.out.println("ENTER YOUR AGE");
		int AGE = s.nextInt();
		System.out.println("ENTER YOUR HEIGHT");
		float height=s.nextFloat();
		System.out.println("ENTER YOUR PERCENTAGE");
		float PERCENTAGE =s.nextFloat();
		System.out.println("ENTER YOUR WEIGHT");
		int weight=s.nextInt();
		
		System.out.println("ENTER YOUR NUMBER");
		long NUMBER=s.nextLong();
		System.out.println("YOUR FIRST LETTER IN YOUR NAME IS : "+FN);
		System.out.println("YOUR LAST LETTER IN YOUR NAME IS : "+LN);
		System.out.println("YOUR NAME : "+NAME);
		System.out.println("YOUR MARTIAL STATUS IS: "+MS);
		System.out.println("YOUR AGE IS: "+AGE);
		System.out.println("YOUR HEIGHT IS :"+height);
		System.out.println("YOUR PERCENTAGE:"+PERCENTAGE);
	    System.out.println("YOUR WEIGHT:"+weight);
	    
	    System.out.println("YOUR MOBILE NUMBER IS :"+NUMBER);
	    }

}

