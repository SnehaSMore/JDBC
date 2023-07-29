package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IPLDAOImplementation implements IPLDAO {


		@Override
		public List<IPL> findAll() throws ClassNotFoundException, SQLException 
		{
			
			ArrayList<IPL>list=new ArrayList<IPL>();
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
			PreparedStatement ps=con.prepareStatement("select * from ipl");
			ResultSet rs=ps.executeQuery();
	while(rs.next())
			{
				IPL i=new IPL();
				i.setTid(rs.getInt(1));
				i.setTname(rs.getString(2));
				i.setCity(rs.getString(3));
				i.setState(rs.getString(4));
				list.add(i);
			}
			
			System.out.println("created successfully");


			// TODO Auto-generated method stub
			return list;
		}

		@Override
		public void insertIPL(IPL i) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
			PreparedStatement ps=con.prepareStatement("insert into ipl values(?,?,?,?) ");
			ps.setInt(1, i.getTid());
			ps.setString(2, i.getTname());
			ps.setString(3, i.getCity());
			ps.setString(4, i.getState());
			ps.executeUpdate();
			con.close();
				
		}
		
		@Override
		public void updateIPL(IPL i) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
			PreparedStatement ps=con.prepareStatement("update ipl set tname=?,city=?,state=? where tid=?");
		
			ps.setString(1, i.getTname());
			ps.setString(2, i.getCity());
			ps.setString(3, i.getState());
			ps.setInt(4, i.getTid());
			ps.executeUpdate();
			con.close();
				
		}
		
		@Override
		public void deleteIPL(IPL i) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");//load the driver
			//create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
			PreparedStatement ps=con.prepareStatement("delete from ipl where tid=?");
		
			
			ps.setInt(1, i.getTid());
			ps.executeUpdate();
			con.close();
			
		}


		
}

		
	
