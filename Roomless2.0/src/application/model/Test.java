package application.model;

import java.awt.Label;
import application.io.CurrentUser; // create user with this class
/**
 * Personality test for new users
 * @author stephanie
 *
 */

public class Test {
	
	/**
	 * TODO: Save the user input to the specified text file
	 */
	private String name; // the name of the user
	private int age; 	 // age of the user
	private int clean; 	 // how clean they are
	private int social;  // how social they are
	private int mates;   // number of roommates looking for
	private int price;   // max amount of money per month
	private boolean start;
	
	/**
	 * constructor for the test
	 * @param users name
	 */
	public Test (String name) {
		this.name = name;
		// initialize everything
		this.age = 0;
		this.clean = 0;
		this.social = 0;
		this.mates = 0;
		this.price = 0;
		start = true;
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
	
}
