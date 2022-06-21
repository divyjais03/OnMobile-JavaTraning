package DAY1;

import java.util.Scanner;

class bank {
	private double bal=5000;		//Encapsulation with private datas
	private int pwd, D,W;
	
	
	
	public void deposit(double money) {
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();				// Taking input in pwd
		
		if (pwd==123)
		{	
			System.out.println("Enter amount t o be deposited: ");
			Scanner d=new Scanner(System.in);
			D=d.nextInt();
			
			bal=bal+D;
			System.out.println("Deposited money: "+D);
			System.out.println("Total money: "+bal);
		}
		else
		{
			System.out.println("Incorrect password...!");
		}
	}
    public void withdraw(double money) {
    	System.out.println("Enter Password: ");
    	Scanner s=new Scanner(System.in);
    	pwd=s.nextInt();
    	if(pwd==123)
    	{	
    		System.out.println("Enter amount t o be Withdraw: ");
			Scanner w=new Scanner(System.in);
			W=w.nextInt();
    		
    		bal=bal-W;
			System.out.println("Withdrawl money: "+W);
			System.out.println("Total money: "+bal);
		}
    	else
		{
			System.out.println("Incorrect password...!");
		}
    	
    }
    public void checkbal()
    {
    	System.out.println("Enter Password: ");
    	Scanner s=new Scanner(System.in);
    	pwd=s.nextInt();
    	if(pwd==123)
    	{
    		System.out.println("Total balance: "+bal);
    	}
    	else
    	{
    		System.out.println("Incorrect Password...!");
    	}
    }
}

public class Banksystem_encapsulation {

	public static void main(String[] args) {
		bank b=new bank();						//object b of class bank
		
		int ch;
		
		/* int pass;
		System.out.println("Set Your Password: ");
		Scanner p=new Scanner(System.in);
		pass=p.nextInt(); */
		
		System.out.println("1. Check Balance?");
		System.out.println("2. Deposite Money?");
		System.out.println("3. Withdraw Money?");
		
		System.out.println("Enter Your choice: ");
		Scanner s2=new Scanner(System.in);
		ch= s2.nextInt();
		
		switch(ch)					// switch case
		{
		case 1: b.checkbal();
		break;
		
		case 2: b.deposit(1000);
		break;
		
		case 3: b.withdraw(2000);
		break;
		
		default: System.out.println("Invalid choice...!");
		
		}
		
	s2.close();	
	}

}
