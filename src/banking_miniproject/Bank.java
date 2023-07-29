package banking_miniproject;

public class Bank {

	private int emp_id;
	private String emp_name;
	private String emp_city;
	private int emp_mobileNo;
	private String emp_email_id;
	private int emp_amount;
	private int withdraw;
	private int deposit;
	
	public Bank() 
	{
		
		
	}
	
	public Bank(int emp_id,String emp_name,String emp_city,int emp_mobileNo,String emp_email_id,int emp_amount,int withdraw,int deposit)
	{
		super();
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_city=emp_city;
		this.emp_mobileNo=emp_mobileNo;
		this.emp_email_id=emp_email_id;
		this.emp_amount=emp_amount;
		this.withdraw=withdraw;
		this.deposit=deposit;
		
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public int getEmp_mobileNo() {
		return emp_mobileNo;
	}

	public void setEmp_mobileNo(int emp_mobileNo) {
		this.emp_mobileNo = emp_mobileNo;
	}

	public String getEmp_email_id() {
		return emp_email_id;
	}

	public void setEmp_email_id(String emp_email_id) {
		this.emp_email_id = emp_email_id;
	}

	public int getEmp_amount() {
		return emp_amount;
	}

	public void setEmp_amount(int emp_amount) {
		this.emp_amount = emp_amount;
	}

	public int getwithdraw() {
		return withdraw;
	}

	public void setWidraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	@Override
	public String toString() {
		return "Bank [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", emp_mobileNo="
				+ emp_mobileNo + ", emp_email_id=" + emp_email_id + ", emp_amount=" + emp_amount + ", withdraw="
				+ withdraw + ", deposit=" + deposit + "]";
	}
	
	

	
	
	
	
	
}
