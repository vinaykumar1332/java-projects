/*Wap to check of e/E character present in String s="javaEEdeve"*/

package String_programes;

public class Demo0 
{
 public static void main(String[]args)
 {
	 String s="javaEEdeve";
	 int count=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)=='e'||s.charAt(i)=='E')
		 {
			 count++;
	     }
	 }
	 System.out.println("COUNT OF e/E is "+count);
 }
}
