 package jdbc;

		     import java.sql.Connection;
		     import java.sql.DriverManager;
		     import java.sql.PreparedStatement;
		     import java.sql.SQLException;

		     public class DeleteExample {

		     	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		     		Class.forName("com.mysql.jdbc.Driver");//load driver
		     	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9585","root","root");
		     	     //create the connection
		     	   PreparedStatement st=con.prepareStatement("delete from products where id=? ");
		     	   st.setInt(1, 1001);
		     	  st.executeUpdate();//excute query
		     	   con.close();
		     	  System.out.println("updated successfully");

		     	}

		     }