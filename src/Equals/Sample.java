package Equals;

public class Sample {
	public static void main(String[]args) {
		Sample s1 =new Sample();
		Sample s2=new Sample();
		Sample s3= s1;
		Sample s4= s2;
		System.out.println(s1+ " "+s2+" "+s3+" "+s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s2));
		}

}
