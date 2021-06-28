
import java.util.Arrays;
import java.util.Scanner;
/**
 * CSC-151 Spring 2021 Midterm Part II.
 * 
 * @version 2.1
 */
public class PasswordGenerator {
	
	/** 
	 * Special characters 
	 *
	 * @return Returns n array of chars containing all valid special characters
	 */
	public static char[] getSpecialCharacters() {
		final char[] SPECIAL_CHARS = {'!', '@', '#', '_', '.', '*'};
		return SPECIAL_CHARS;
	}
	
	/** 
	 * Valid password characters 
	 *
	 * @return Returns String containing all valid password characters
	 */
	public static final String getValidPasswordCharacters() {
		final String PASSWORD_CHARS = "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVEWXYZ0123456789";
		return PASSWORD_CHARS;
	}
	
	/** 
	 * @return Returns a single String of 140 four-letter words than can be used in a password.
	 * 
	 */
	public static final String getAllFourLetterWords() {

		final String FOUR_LETTER_WORDS =
			"able bane barn bile blip boat bolt bran brat brim bulb "+
			"bull burn cane card cart clan clip cold cone core dart "+
			"deny dial dang dirk dolt door dote drip drop dupe each "+
			"earn easy fast fest file five flap flip flop foal folk "+
			"fort four full gave give gone grin hard hurt idle isle "+
			"join king knit knob land lane lard link list live long "+
			"lung made main many mile mine moat mole mote mule nine "+
			"norm note paid part pick pile ping pipe plan pole pong "+
			"port prim pull quid quip quit rain rang redo ring ripe "+
			"role root rote rung sand sang silk sing sink slam slow "+
			"song sort spam sulk take tame tang tide tile time tint "+
			"toll tone took tote trap trip turn undo vile volt vote "+
			"wart wing woke wool wore writ zero zoom";
	   return FOUR_LETTER_WORDS;
	}

	
	
	/** 
	 * Create a password 
	 * 
	 * @return Returns a password meeting all of the specifications
	 */
	public static String createPassword() {
		
		String password = "";
		String[] letters = (getAllFourLetterWords().split(" "));
		char[] symbols = getSpecialCharacters();
		String passChar = getValidPasswordCharacters();
		int rand = (int)(Math.random()*(letters.length));
		password += letters[rand];
		rand = (int)(Math.random()*(symbols.length));
		password += symbols[rand];
		rand = (int)(Math.random()*(10));
		password += Integer.toString(rand);
		rand = (int)(Math.random()*(10));
		password += Integer.toString(rand);
		for(int i=0; i<5; i++) {
			rand = (int)(Math.random()*(passChar.length()));
			char c = passChar.charAt(rand);
			password += c;
		}
		return password; 
	}

	/** 
	 * Return true if this password is unique to the list of generated passwords.  
	 */	
	// TODO: Write the method isUniquePassword. 
	public static boolean isUniquePassword(String uniquePasswords, String passArray) {
		String[] array = passArray.split(" ");
		for(int i=0; i<array.length; i++) {
			if(array[i] == uniquePasswords) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Add aPassword to the list of unique passwords
	 * 
	 * @param aPassword: the password to add
	 * @param passwordList: A string containing all unique passwords, separated by spaces
	 * @return Updated passwordList with the new password
	 */
	public static String addUniquePassword(String aPassword, String passwordList) {
		
		return passwordList += aPassword += " ";
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many passwords do you want to generate? ");
		int numPasswords = scanner.nextInt();
		scanner.close();
		String password = "";
		String uniquePasswords = "";
		int counter = 0;
		while(counter < numPasswords) {
			password = createPassword();
			
			if(isUniquePassword(password, uniquePasswords)) {
				uniquePasswords = addUniquePassword(password, uniquePasswords);
				counter++;
			}
		}
		String[] passArray = (uniquePasswords.split(" "));
		for(int i=0; i < passArray.length; i++) {
			System.out.println((i+1) + ": " + passArray[i]);
		}
		
	}
}
