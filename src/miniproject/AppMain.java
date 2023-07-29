package miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class AppMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("IPL MANAGEMENT SYSTEM");
		System.out.println("1.IPL VIEW");
		System.out.println("2.ADD IPL");
		System.out.println("3.Update IPL ");
		System.out.println("4.Delete IPL");
		System.out.println("5.Exit");
		do
		{
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					new IPLService().ViewIPL();
					break;
					
				case 2:
					new IPLService().insertIPL();
					break;
				case 3:
					new IPLService().updateIPL();
					break;
					
				case 4:
					new IPLService().deleteIPL();;
					break;
					
					
			}
			System.out.println("do you want to continue");
		 s=sc.next();
			
		}
		while(s.equals("yes"));
		

	}
					
		

}
	
	