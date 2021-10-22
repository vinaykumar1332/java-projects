
package Scanner;

import java.util.Scanner;

public class Easy 
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	String name;
	int rollno;
	float marks;
	System.out.println("ENTER YOUR NAME");
	name=obj.nextLine();
	System.out.println("ENTER YOUR ROLL NUMBER");
	rollno=obj.nextInt();
	System.out.println("ENTER YOUR MARKS");
	marks=obj.nextFloat();
	System.out.println("Name="+name);
	System.out.println("ROLL NUMBER="+rollno);
	System.out.println("MARKS="+marks);
}
}



