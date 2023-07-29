package miniproject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class IPLService {

	
	
		public void ViewIPL() throws ClassNotFoundException, SQLException
		{
			List<IPL>list=new IPLDAOImplementation().findAll();
			for(IPL i:list)
			{
				System.out.println(i);
			}
			
		}
		
		
		public void insertIPL() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id");
			int tid=sc.nextInt();
			System.out.println("enter the Tname");
			String tname=sc.next();
			System.out.println("enter the city");
			String city=sc.next();
			System.out.println("enter the state");
			String state=sc.next();
			IPL i=new IPL();
			i.setTid(tid);
			i.setTname(tname);
			i.setCity(city);
			i.setState(state);
			new IPLDAOImplementation().insertIPL(i);
			
			
		}

		
		public void updateIPL() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the Tname");
			String tname=sc.next();
			System.out.println("enter the city");
			String city=sc.next();
			System.out.println("enter the state");
			String state=sc.next();
			System.out.println("enter the id");
			int tid=sc.nextInt();
			IPL i=new IPL();
		    i.setTname(tname);
			i.setCity(city);
			i.setState(state);
			i.setTid(tid);
			new IPLDAOImplementation().updateIPL(i);
		}
		
		public void deleteIPL() throws ClassNotFoundException, SQLException
		{
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter the id");
			int tid=sc.nextInt();
			IPL i=new IPL();
		   
			i.setTid(tid);
			new IPLDAOImplementation().deleteIPL(i);
		}
		
		

	}

