package bankingApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public abstract class WormReadFromFile {


	@SuppressWarnings("unchecked")
	public static Map<String,WormUser> WormUsersRead(String arg) {

		Map<String,WormUser> worm_bank_users = null;
		  try {
		     FileInputStream fileIn = new FileInputStream(arg);
		     ObjectInputStream in = new ObjectInputStream(fileIn);
		     worm_bank_users = (Map<String,WormUser>) in.readObject();
		     in.close();
		     fileIn.close();
		  } catch (IOException i) {
			 System.out.println("Well... This is awkward, but we couldnt connect to the database.");
			 System.out.println("Please try again later.");
		     System.exit(3);
		  } catch (ClassNotFoundException c) {
		     System.out.println("Something bad happened. The file didnt contain a set of users!!");
		     System.out.println("Please call the System administrator.");
		     System.exit(3);
		  }
		return worm_bank_users;
		}
	
	@SuppressWarnings("unchecked")
	public static Map<String,CustomerAccount> WormAccountRead(String arg) {

		Map<String,CustomerAccount> worm_bank_users = null;
		  try {
		     FileInputStream fileIn = new FileInputStream(arg);
		     ObjectInputStream in = new ObjectInputStream(fileIn);
		     worm_bank_users = (Map<String,CustomerAccount>) in.readObject();
		     in.close();
		     fileIn.close();
		  } catch (IOException i) {
			 System.out.println("Well... This is awkward, but we couldnt connect to the database.");
			 System.out.println("Please try again later.");
		     System.exit(3);
		  } catch (ClassNotFoundException c) {
		     System.out.println("Something bad happened. The file didnt contain a set of users!!");
		     System.out.println("Please call the System administrator.");
		     System.exit(3);
		  }
		return worm_bank_users;
		}
	
}


