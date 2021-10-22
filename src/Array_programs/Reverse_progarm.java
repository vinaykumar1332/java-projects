package Array_programs;


import java.util.Scanner; 
public class Reverse_progarm { 
 public static void main(String[] args) { 
 Scanner s=new Scanner(System.in); 
 int size; 
 System.out.println("Enter the size of an array:"); 
 size=s.nextInt(); 
 int a[]=new int[size]; 
 for(int i=0;i<a.length;i++) 
 { 
a[i]=s.nextInt(); 
} 
for(int j=a.length-1;j>=0;j--) 
{ 
System.out.println("a["+j+"]="+a[j]); 
} 
}
 }