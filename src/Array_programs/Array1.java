package Array_programs;

public class Array1 {
public static void main(String[] args) { 
 int a[]=new int[5]; 
 a[0]=100; 
 a[1]=200; 
 a[2]=300; 
 a[3]=400; 
 a[4]=500; 
 /* System.out.println(a[0]);
 System.out.println(a[1]);
 System.out.println(a[2]);
 System.out.println(a[3]);
 System.out.println(a[4]); */
 System.out.println(a.length); 
 //print array elements using for loop
 for(int i=0;i<a.length;i++) 
 { 
 System.out.println(a[i]); 
 } 
 String s[]= {"java","sql","aptitude","selenium"}; 
 System.out.println("-----Printing using for each loop------"); 
 //for-each Loop or enhanced Loop
 /* syntax: for(arraytype varname:arrayname)
 {
 System.out.println(varname);
 } */
 for(String data:s) 
 { 
 System.out.println(data); 
 } 
}
}