package String_programes;

public class Pallindrome { 
public static void main(String[] args) { 
 String actual="vinay"; 
 String rev=""; 
 for(int i=actual.length()-1;i>=0;i--) 
 { 
 rev=rev+actual.charAt(i); 
 } 
 System.out.println("Actual String : "+actual); 
 System.out.println("Reverse String : "+rev); 
 if(actual.equals(rev)) 
 { 
 System.out.println("Given String is pallindrome"); 
 }
 else
 System.out.println("Given String is not Pallindrome");
}
}
