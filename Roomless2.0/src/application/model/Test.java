package application.model;

import java.awt.Label;
import application.io.CurrentUser; // create user with this class
/**
 * Personality test for new users
 * @author stephanie
 *
 */

public class Test {
	
	private String name; // the name of the user
	private int age; 	 // age of the user
	private int clean; 	 // how clean they are
	private int social;  // how social they are
	private int mates;   // number of roommates looking for
	private int price;   // max amount of money per month
	private boolean start;
	
	/**
	 * Constructor for the test
	 */
	public Test (String user) {
		name = "";
		age = 0;
		clean = 0;
		social = 0;
		mates = 0;
		price = 0;
		start = true;
	}
	
	
	

}
