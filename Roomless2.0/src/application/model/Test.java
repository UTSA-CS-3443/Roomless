package application.model;

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
	
	public Test () {
		name = "";
		age = 0;
		clean = 0;
		social = 0;
		mates = 0;
		price = 0;
		start = true;
	}
	
	public String getName () {
		return name;
	}
	
	public void update (String text) {
		if (start) {
			
		}
	}

}
