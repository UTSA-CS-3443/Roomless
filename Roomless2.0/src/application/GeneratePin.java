package application;

import java.util.Random;

/**
 * Class that will generate a random four digit pin for the users password. Will fill with leading 0's to make 4 digits.
 * @author Christopher Nieland 
 *
 */

public class GeneratePin 
{
	/**
	 * Method that generates the pin. Uses the random library to generate a random number from 0-9999.
	 * Will fill with leading zeros if the number generated is 3 digits.
	 * EX. 123 -> 0123   2 -> 0002.
	 * @return
	 */
	public String genPin()
	{
		Random rand = new Random();											//variable to hold the random library access				
		String formattedPin = String.format("%04d", rand.nextInt(10000));;	//formattedPin holds the String that is the formatted pin
		
		return formattedPin;												//returns the string
	}
}
