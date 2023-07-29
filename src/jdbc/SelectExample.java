package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load driver
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
	     //create the connection
	   PreparedStatement st=con.prepareStatement("select * from products");
	   ResultSet rs=st.executeQuery();
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1));
		   System.out.println(rs.getString(2));
		   System.out.println(rs.getInt(3));
	   }
	     //con.close();
	     System.out.println("insert successfully");

	}

}