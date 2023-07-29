 package jdbc;

		     import java.sql.Connection;
				import java.sql.DriverManager;
				import java.sql.PreparedStatement;
				import java.sql.SQLException;

		     public class UpdateExaample {

		     	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		     		Class.forName("com.mysql.jdbc.Driver");//load driver
		     	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
		     	     //create the connection
		     	   PreparedStatement st=con.prepareStatement("update products set pname=?,noofproduct=? where id=?");
		     	   st.setString(1,"kidschair");
		    	   st.setInt(2, 178);
		    	   st.setInt(3, 1001);
		     	  st.executeUpdate();//excute query
		     	   con.close();
		     	  System.out.println("updated successfully");

		     	}

		     }
		     
		     
		     
		    