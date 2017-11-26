package application.test;

import application.model.OtherUsers;
import application.model.Test;
import javafx.application.Platform;
import application.io.CurrentUser;
/**
 * Test the application with users
 * @author stephanie
 *
 */
public class UsersTest {
	
	public static void main (String [] args) {
		
	// create users to display to the current user
	CurrentUser user1 = new CurrentUser ("Max Amillion");
	CurrentUser user2 = new CurrentUser ("Sarah Brown");
	CurrentUser user3 = new CurrentUser ("Joyce Smith");
	CurrentUser user4 = new CurrentUser ("Adam Solo");
	CurrentUser user5 = new CurrentUser ("Jim Halpert");
	
	user1.setAge(21);
	user1.setClean(2);
	user1.setSocial(2);
	user1.setMates(1);
	user1.setPrice(600);
	user1.setTemp(1);
	user1.setEmail("maaaax@hotmail.com");
	
	user2.setAge(18);
	user2.setClean(3);
	user2.setSocial(5);
	user2.setMates(2);
	user2.setPrice(700);
	user2.setTemp(1);
	user2.setEmail("sbrown@yahoo.com");
	
	user3.setAge(23);
	user3.setClean(5);
	user3.setSocial(1);
	user3.setMates(1);
	user3.setPrice(800);
	user3.setTemp(0);
	user3.setEmail("joyce@gmail.com");
	
	user4.setAge(20);
	user4.setClean(4);
	user4.setSocial(5);
	user4.setMates(3);
	user4.setPrice(400);
	user4.setTemp(1);
	user4.setEmail("skywalker66@sith.org");
	
	user5.setAge(25);
	user5.setClean(3);
	user5.setSocial(1);
	user5.setMates(1);
	user5.setPrice(1000);
	user5.setTemp(1);
	user5.setEmail("jhalpert@dmi.com");
	
	}
	
}
