package Array_programs;

import java.util.*; 
public class First_Last_Element { 
public static void main(String[] args) { 
 Scanner s=new Scanner(System.in); 
 int size; 
 System.out.println("ENTER YOUYR ARRAY SIZE  :"); 
 size=s.nextInt(); 
 System.out.println("ENTER YOUR ARRAY VALUES :");
 int a[]=new int[size]; 
 for(int i=0;i<a.length;i++) 
 { 
 a[i]=s.nextInt(); 
 } 
 System.out.println(a[0]); 
 System.out.println(a[a.length-1]); 
  }
}
