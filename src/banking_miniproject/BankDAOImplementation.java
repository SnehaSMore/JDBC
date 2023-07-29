package banking_miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import miniproject.IPL;

public class BankDAOImplementation implements BankDAO {

	
		@Override
		public List<Bank> findAll() throws ClassNotFoundException, SQLException 
		{
			
			ArrayList<Bank>list=new ArrayList<Bank>();
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
			PreparedStatement ps=con.prepareStatement("select * from Bank");
			ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Bank bemp=new Bank();
			bemp.setEmp_id(rs.getInt(1));
			bemp.setEmp_name(rs.getString(2));
			bemp.setEmp_city(rs.getString(3));
			bemp.setEmp_mobileNo(rs.getInt(4));
			bemp.setEmp_email_id(rs.getString(5));
			bemp.setEmp_amount(rs.getInt(6));
//			bemp.setWidraw(rs.getInt(7));
			bemp.setDeposit(rs.getInt(8));
			
		
			list.add(bemp);
		}
		
		System.out.println("created successfully");
		
		return list;
	}
		
	@Override	
	public void insertBankEmp(Bank bemp) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Bank values(?,?,?,?,?,?,?,?) ");
		ps.setInt   (1,bemp.getEmp_id());
		ps.setString(2,bemp.getEmp_name());
		ps.setString(3,bemp.getEmp_city());
		ps.setInt   (4,bemp.getEmp_mobileNo());
		ps.setString(5,bemp.getEmp_email_id());
		ps.setInt	(6,bemp.getEmp_amount());
    	ps.setInt	(7,bemp.getwithdraw());
		ps.setInt(8,bemp.getDeposit());
		ps.executeUpdate();
		con.close();		
	}

	@Override
	public void updateBankEmp(Bank bemp) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");//load driver
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585?useSSL=false","root","root");
		
		
		PreparedStatement ps=con.prepareStatement("update Bank set Emp_name=?,Emp_city=?,Emp_mobileNo=? Emp_email_id=?,Emp_amount=?,withdraw=?,Deposit=? where Emp_id=?");
	
		ps.setInt   (1,bemp.getEmp_id());
		ps.setString(2,bemp.getEmp_name());
		ps.setString(3,bemp.getEmp_city());
		ps.setInt   (4,bemp.getEmp_mobileNo());
		ps.setString(5,bemp.getEmp_email_id());
		ps.setInt	(6,bemp.getEmp_amount());
		ps.setInt	(7,bemp.getwithdraw());
		ps.setInt   (8,bemp.getDeposit());
	    ps.executeUpdate();
		con.close();
			
	}
	
	@Override
	public void deleteBankEmp(Bank bemp) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
		PreparedStatement ps=con.prepareStatement("delete from Bank where Emp_id=?");
	
		
		ps.setInt(1, bemp.getEmp_id());
		ps.executeUpdate();
		con.close();
		
	}

	/*@Override
	public void widtdrowBankEmp(Bank bemp) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
		PreparedStatement ps=con.prepareStatement("update Bank set withdraw=?");*/
		
		
	}
	
	
	

