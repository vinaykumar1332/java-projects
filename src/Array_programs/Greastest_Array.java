package Array_programs;

import java.util.Scanner;
public class Greastest_Array {
public static void main(String[] args) { 
Scanner s=new Scanner(System.in); 
int size; 
System.out.println("Enter the size of an array:"); 
size=s.nextInt(); 
System.out.println("Enter the data : "); 
int a[]=new int[size]; 
for(int i=0;i<a.length;i++) 
{ 
a[i]=s.nextInt(); 
} 
int max=a[0]; 
//checking condition of maximum element 
for(int j=0;j<a.length;j++) 
{ 
if(a[j]>max) 
{ 
max=a[j]; 
} 
} 
System.out.println("Maximum number fro array is : "+max); 
}}