import java.util.Scanner;

abstract public class Bank {

	public String Name="My Bank";
	public String IFSC="My Bank 123";
	
		public void bankdetail()
		{
			System.out.println("Bank_detail"+Name+""+"IFSC_code"+IFSC);
		}
		abstract void Deposite();
		abstract void withdraw();
		abstract void checkbal();
		
	
}
	abstract class Bankservice extends Bank
{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public void Deposite()
	{
		System.out.println("Enter password");
		Scanner s=new Scanner (System.in);
		pwd =s.nextInt();
		if(pwd==123)
		{
			System.out.println("Enter Deposit Amount");
			money =s.nextDouble();
			bal=bal+money;
			
			System.out.println("Deposited money"+money);
			System.out.println("Total balance"+bal);
		}
		else
		{
			System.out.println("Incorrect Password");
			
		}
	}
	public void withdraw()
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner (System.in);
		pwd=s.nextInt();
		if(pwd==123) {
			System.out.println("Enter withdraw Amount");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdrawn money"+ money);
			System.out.println("Total bal"+ bal);
			
		}

	else
	{
		System.out.println("Incorrect password");
		
	}
	}
	class Customer {
			public static void main (String[]args)
			{
				Bankservice b=new Bankservice();
				b.bankdetail();
				int ch;
				System.out.println("Deposite");
				System.out.println("withdraw");
				System.out.println("checkbalance");
				
				System.out.println("\n Enter your vhoice");
				Scanner s2 =new Scanner (System.in);
				ch=s2.nextInt();
				switch(ch)
				{
				case 1:b.Deposite();
				break;
				
				case 2: b.withdraw();
				break;
				
				case 3: b.checkbal();
				
			break;
			
			default: System.out.println("Invalid choice");
			
				}
			}
	}
	
