package beans1;

public class Customer {

	private String id, name, job; 
	private double balance;

	
	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public Customer(String id, String name, String job, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

}
