package application.model;

/**
 * Stores account data inside an object
 * @author Derrick
 *
 */

public class Account {
	
	private String name;
	private String PIN;

	public Account(String name, String pin) {
		setName(name);
		setPIN(pin);
	}
	
	public String getName() {
		return name;
	}
	
	public String getPIN() {
		return PIN;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPIN(String pin) {
		this.PIN = pin;
	}
}