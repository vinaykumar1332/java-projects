package Array_programs;

import java.util.*; 
public class Even_position 
 { 
 public static void main(String[] args) 
 { 
 Scanner s=new Scanner(System.in); 
 int size; 
 System.out.println("Enter the size of an array:"); 
 size=s.nextInt(); 
 int a[]=new int[size]; 
 for(int i=0;i<a.length;i++) 
 { 
 a[i]=s.nextInt(); 
 } 
 int sum=0; 
 for(int j=0;j<a.length;j++) 
 { 
 if(j%2==0) 
 sum=sum+a[j]; 
 } 
 System.out.println("Sum Of Even positions : "+sum); 
 }
 }
