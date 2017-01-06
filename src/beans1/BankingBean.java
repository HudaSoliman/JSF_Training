package beans1;

import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class BankingBean {
	private String customerId;
	private String password;
	private Customer customer;
	@ManagedProperty(value = "#{currentLookupService}")
	private CustomerLookupService service;
	private static CustomerLookupService lookupService = new CustomerSimpleMap();

	public void setService(CustomerLookupService service) {
		this.service = service;
	}

	public String getCustomerId() {
		return (customerId);
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId.trim();
		if (this.customerId.isEmpty()) {
			this.customerId = "(none entered)";
		}
	}

	public String getPassword() {
		return (password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String showBalance() {
		if (customerId == "(none entered)" && password.isEmpty()) {
			return ("empty-fields?faces-redirect=true");
		}
		if (!password.equals("secret")) {
			return ("wrong-password?faces-redirect=true");
		}
		customer = lookupService.findCustomer(customerId);
		if (customer == null) {
			return ("unknown-customer?faces-redirect=true");
		} else if (customer.getBalance() < 0) {
			// return ("negative-balance");
			return ("normal-balance?faces-redirect=true");
		} else if (customer.getBalance() < 10000) {
			return ("normal-balance?faces-redirect=true");
		} else {
			// return ("high-balance");
			return ("normal-balance?faces-redirect=true");
		}
	}

	public Customer getCustomer() {
		return customer;
	}
}