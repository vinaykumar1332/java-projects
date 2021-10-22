package Constructor;

public class Car 
{
	String company;
	String color;
	String type;
	int price;
	public  Car(String company)
	{
		this.company="Benz";
		this.color="red";
		this.type="d10";
		this.price=90000;
	}
	public Car(String company,String color,String type,int price)
	{   
		this.company="audi";
		this.color="balck";
		this.type="a6";
		this.price=20000;
	}
	public static void main(String[]args)
	{
		Car c1 = new Car("audi");
		System.out.println(c1.company);
		Car c2 = new Car("audi","color","a6",20000);
		System.out.println(c2.company+".."+c2.color+"..."+c2.type+"..."+c2.price);
	}

}
