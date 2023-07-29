package banking_miniproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BankService {

	
	
		public void ViewBank() throws ClassNotFoundException, SQLException
		{
			List<Bank>list=new BankDAOImplementation().findAll();
			for(Bank bemp:list)
			{
				System.out.println(bemp);
			}
			
		}
		
		
		public void insertBankEmp() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the emp_id");
			int emp_id=sc.nextInt();
			
			System.out.println("enter the emp_name");
			String emp_name=sc.next();
			
			System.out.println("enter the emp_city");
			String emp_city=sc.next();
			
			System.out.println("enter the emp_mobileNo");
			int emp_mobileNo=sc.nextInt();
			
			System.out.println("enter the emp_email_id");
			String emp_email_id=sc.next();
			
			System.out.println("enter the emp_amount");
			int emp_amount=sc.nextInt();
			
			System.out.println("enter the withdraw");
			int withdraw=sc.nextInt();
			
			System.out.println("enter the deposit");
			int deposit=sc.nextInt();
			
			Bank bemp=new Bank();
			bemp.setEmp_id(emp_id);
			bemp.setEmp_name(emp_name);
			bemp.setEmp_city(emp_city);
			bemp.setEmp_mobileNo(emp_mobileNo);
			bemp.setEmp_email_id(emp_email_id);
			bemp.setEmp_amount(emp_amount);
			bemp.setWidraw(withdraw);
			bemp.setDeposit(deposit);
			
			new BankDAOImplementation().insertBankEmp(bemp);
			
			
		}

		
		public void updateBankEmp() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the emp_name");
			String emp_name=sc.next();
			
			System.out.println("enter the emp_city");
			String emp_city=sc.next();
			
			System.out.println("enter the emp_mobileNo");
			int emp_mobileNo=sc.nextInt();
			
			System.out.println("enter the emp_email_id");
			String emp_email_id=sc.next();
			
			System.out.println("enter the emp_amount");
			int emp_amount=sc.nextInt();
			
			System.out.println("enter the withdraw");
			int withdraw=sc.nextInt();
		
			System.out.println("enter the deposit");
			int deposit=sc.nextInt();
			
			System.out.println("enter the emp_id");
			int emp_id=sc.nextInt();
			
			
			Bank bemp=new Bank();
			
			bemp.setEmp_name(emp_name);
			bemp.setEmp_city(emp_city);
			bemp.setEmp_mobileNo(emp_mobileNo);
			bemp.setEmp_email_id(emp_email_id);
			bemp.setEmp_amount(emp_amount);
			bemp.setWidraw(withdraw);
			bemp.setDeposit(deposit);
			bemp.setEmp_id(emp_id);
			
			new BankDAOImplementation().updateBankEmp(bemp);
		}
		
		public void deleteBankEmp() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter the emp_id");
			int emp_id=sc.nextInt();
			Bank bemp=new Bank();
		   
			bemp.setEmp_id(emp_id);
			
			new BankDAOImplementation().deleteBankEmp(bemp);
		}
		
		

	}

