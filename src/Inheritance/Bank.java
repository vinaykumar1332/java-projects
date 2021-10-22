package Inheritance;

 class Bank
{
	String accname="vinay";
	int amount1= 20000;
	public void details()
	{
		System.out.println("accholder name: "+accname+"  "+"total amount: "+amount1);
	}

}
 class Deposit extends Bank
{
 double bal=1000;
 public void depoit()
 {
	 System.out.println("available balance in your account:"+bal);
	 }
 }
 class withdraw extends Deposit
 {
	 double amount=2000;
	 public void aval()
	 {
		 if(amount1>bal)
       {
	 System.out.println("sorry insufficient fund");
      }
 else
     {
	 System.out.println("collect amount");
     }
 }
 }
 class cust extends withdraw
 {
	 public static void main(String args[])
	 {
		 withdraw d1 =new withdraw();
		 d1.details();
		 d1.aval();
		 d1.depoit();
	 }
 }
 
