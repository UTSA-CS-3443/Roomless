package application.io;
import application.model.Test; // how we get information from the user
/**
 * Class to create the current user based on information from the test they take
 * @author stephanie
 *
 */

public class CurrentUser {
	private String name;		// name of the user
	private int age;			// age of the user
	private int clean;			// how clean they are
	private int social;			// how social they are
	private int mates;			// number of roommates looking for
	private int price;			// max amount of money per month
	private int temp;			// preferred temp of user: 1 for hot 0 for cold
	
	/**
	 * Constructor
	 * @param the users name
	 */
	public CurrentUser (String name) {
		this.name = name;
	}
	/**
	 * Set the name of the user
	 * @param name
	 */
	public void setName (String name) {
		this.name = name;
	}
	/**
	 * Get the name of the user
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the age of the user
	 * @param age
	 */
	public void setAge (int age) {
		this.age = age;
	}
	/**
	 * get the age of the user
	 * @return
	 */
	public int getAge () {
		return age;
	}
	/**
	 * set the users self defined cleanliness
	 * @param clean
	 */
	public void setClean (int clean) {
		this.clean = clean;
	}
	/**
	 * get the users rating of cleanliness
	 * @return
	 */
	public int getClean () {
		return clean;
	}
	/**
	 * set the users self defined sociability
	 * @param
	 */
	public void setSocial (int social) {
		this.social = social;
	}
	/**
	 * get the users rating of sociability
	 * @return
	 */
	public int getSocial () {
		return social;
	}
	/**
	 * set users preferred amount of rent per month
	 * @param price
	 */
	public void setPrice (int price) {
		this.price = price;
	}
	/**
	 * get the preferred amount of rent
	 * @return
	 */
	public int getPrice () {
		return price;
	}
	/**
	 * set the preferred amount of roommates
	 * @param mates
	 */
	public void setMates (int mates) {
		this.mates = mates;
	}
	
	/**
	 * get the amount of preferred roommates
	 * @return
	 */
	public int getMates () {
		return mates;
	}
	/**
	 * set users preferred temp
	 * @param temp
	 */
	public void setTemp (int temp) {
		this.temp = temp;
	}
	/**
	 * get the users preferred temp
	 */
	public int getTemp() {
		return temp;
	}
	/**
	 * Return string for needed information
	 */
	public String toString() {
		String pref = null;
		if (getTemp() == 1) {
			pref = "cold";
		} else {
			pref = "warm";
		}
		String info = ( "User: " + getName() + "\nPreferred number of roommates: " + getMates() +
						"\nUsers cleanliness: " + getClean() + "\nUsers sociability: " + getSocial() +
						"\nUsers preferred temp: " + pref +
						"\nUsers max amount of rent per month: " + getPrice() + "\n");
		return (info);
	}
	
}
























