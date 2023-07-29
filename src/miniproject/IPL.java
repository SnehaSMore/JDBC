package miniproject;

public class IPL {
	
	private int tid;
	private String tname;
	private String city;
	private String state;
	
	
	public IPL()
	{
		
	}
	
	
	public IPL(int tid, String tname, String city, String state) 
	{
		super();
		this.tid = tid;
		this.tname = tname;
		this.city = city;
		this.state = state;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "IPL [tid=" + tid + ", tname=" + tname + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
	
}
