package miniproject;

import java.sql.SQLException;
import java.util.List;

public interface IPLDAO {

	public List<IPL> findAll() throws ClassNotFoundException, SQLException;
	
	public void insertIPL(IPL i) throws ClassNotFoundException, SQLException;
	
	public void updateIPL(IPL i) throws ClassNotFoundException, SQLException;
	
	public void deleteIPL(IPL i) throws ClassNotFoundException, SQLException;
	
	
}

