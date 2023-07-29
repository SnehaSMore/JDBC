package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
     Class.forName("com.mysql.jdbc.Driver");//load driver
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
     //create the connection
     Statement st=con.createStatement();
     String query="create table products(id int(67),pname varchar(67),noofproduct int)";
     
     st.execute(query);//excute query
     con.close();
     System.out.println("created successfully");
     
     


	}

}