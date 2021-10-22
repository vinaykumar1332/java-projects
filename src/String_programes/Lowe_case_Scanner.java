package String_programes;
import java.util.Scanner;
public class Lowe_case_Scanner 
{
 public static void main(String[]args) 
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter your Higher Order String value");
  //----------main program-----------------//
  String s1 =sc.next();
  String s2=s1;
  String s3=s2.toLowerCase();
  System.out.println("Orginial String value : "+s1);
  System.out.println("Modified String vlaue : "+s3);
 }
 
}
