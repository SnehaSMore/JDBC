package banking_miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("BANK MANAGEMENT SYSTEM");
		System.out.println("1.BANK VIEW");
		System.out.println("2.ADD BANKEMP");
		System.out.println("3.Update BANKEMP ");
		System.out.println("4.Delete BANKEMP");
		System.out.println("5.Exit");
		do
		{
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				new BankService().ViewBank();
				break;
				
			case 2:
				new BankService().insertBankEmp();
				break;
			case 3:
				new BankService().updateBankEmp();
				break;
				
			case 4:
				new BankService().deleteBankEmp();;
				break;
					
			}
			System.out.println("do you want to continue");
			s=sc.next();
			
		}
		while(s.equals("yes"));
		

	}
					
		

}
	
	