package banking_miniproject;

import java.sql.SQLException;
import java.util.List;

public interface BankDAO {

public List<Bank> findAll() throws ClassNotFoundException, SQLException;
	
	public void insertBankEmp(Bank bemp) throws ClassNotFoundException, SQLException;
	
	public void updateBankEmp(Bank bemp) throws ClassNotFoundException, SQLException;
	
	public void deleteBankEmp(Bank bemp) throws ClassNotFoundException, SQLException;
	
	//public void widtdrowBankEmp(Bank bemp) throws ClassNotFoundException, SQLException;
	
}
