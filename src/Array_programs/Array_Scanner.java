package Array_programs;

import java.util.*; //Ex: Using scanner
public class Array_Scanner
{ 
public static void main(String[] args) 
{ 
 Scanner sc = new Scanner(System.in); 
int size; 
 System.out.println("Enter the size of an array:"); 
size=sc.nextInt();//4
int a[]=new int[size];

for(int i=0;i<a.length;i++) 
 { 
 a[i]=sc.nextInt(); 
 } 
 System.out.println("Array elements are.........."); 

for(int j=0;j<a.length;j++) 
 { 
 System.out.println(a[j]); 
 } 
} 
} 