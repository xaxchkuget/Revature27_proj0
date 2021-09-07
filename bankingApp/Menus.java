package bankingApp;

public abstract class Menus{

	private static String mainMenu= "Hello, and welcome to 'The Bank of the Worm'. Please make a selection:\n"
			+  "===========================================================================================\n"
			+  "1: Admin Login\n"
			+  "2: Employee Login\n"
			+  "3: Returning Customer\n"
			+  "4: New Customer\n"
			+  "5: Cancel\n"
			+  "==========================================================================================\n";
	
	private static String ExitMenu= "Are you sure you want to Exit the application?\n";
	
	private static String adminMenu1= "Spread the warmth of the Worms Love.\n"
			+  "===========================================================\n"
			+  "1: Customer Accounts\n"
			+  "2: Employee Accounts\n"
			+  "3: Review Applications\n"
			+  "4: Cancel\n"
			+  "===========================================================\n";
	
	private static String adminMenu2= "Spread the warmth of the Worms Love.\n"
			+  "\n"
			+  "1: Edit Account\n"
			+  "2: Edit Transactions\n"
			+  "3: Close account\n"
			+  "4: Cancel\n"
			+  "==========================================================================================\n";
	
	private static String employeeMenu= "The Worm is Ever present and ever watching.\n"
			+  "====================================================================\n"
			+  "1: View Accounts\n"
			+  "2: View Transactions\n"
			+  "3: Review Applications\n"
			+  "4: Cancel\n"
	        +  "==========================================================================================\n";
	
	private static String customerMenu= "What may we help you with today?:\n"
								+  "==============================================================================\n"
								+  "1: Make a withdrawal\n"
								+  "2: Make a deposit\n"
								+  "3: Transfer funds \n"
								+  "4: Cancel\n"
								+  "==============================================================================\n";
	
	private static String newCustomerMenu= "Welcome to 'The Bank of the Worm'. What may we help you with today?:\n"
								+  "============================================================================\n"
								+  "1: Open an Account\n"
								+  "2: Open a joint account\n"
								+  "3: Cancel\n"
								+  "============================================================================\n";
	
	private static String loginuserNamePrompt= "===========================================================================================\n"
			+"Please enter your Username\n";
	
	private static String loginPasswordPrompt= "===========================================================================================\n"
											+  "Please enter your Password\n";
	
	private static String Womrwithdrawl=
			   "============================================================================\n"
			+  "Enter the desired ammount to withdraw.\n"
			+  "To Cancel enter 0\n"
			+  "============================================================================\n";
	
	private static String Wormdeposit= 
			   "============================================================================\n"
			+  "Enter the desired ammount to deposit.\n"
			+  "To Cancel enter 0\n"
			+  "============================================================================\n";
	
	private static String Wormtransfer1= 
			   "============================================================================\n"
			+  "please enter the account number you wish to transfer to.\n"
			+  "to Cancel enter 0\n"
			+  "============================================================================\n";
	
	private static String Wormtransfer2= 
			   "============================================================================\n"
			+  "please enter the desired ammount to transfer.\n"
			+  "to Cancel enter 0\n"
			+  "============================================================================\n";
	
	public static void showWomrwithdrawl() {
		System.out.print(Womrwithdrawl);
	}
	
	public static void showWormdeposit() {
		System.out.print(Wormdeposit);
	}
	
	public static void showWormtransfer1() {
		System.out.print(Wormtransfer1);
	}
	
	public static void showWormtransfer2() {
		System.out.print(Wormtransfer2);
	}
	
	
	public static void showMainMenu() {
		System.out.print(mainMenu);
	}
	
	public static void showExitmenu() {
		System.out.print(ExitMenu);
	}
	
	public static void showadminMenu1() {
		System.out.print(adminMenu1);
	}
	public static void showadminMenu2() {
		System.out.print(adminMenu2);
	}	
	public static void showemployeeMenu() {
		System.out.print(employeeMenu);
	}
	
	public static void showcustomerMenu() {
		System.out.print(customerMenu);
	}
	
	public static void shownewCustomerMenu() {
		System.out.print(newCustomerMenu);
	}

	public static void loginuserNamePrompt() {
		System.out.print(loginuserNamePrompt);
	}

	public static void loginPasswordPrompt() {
		System.out.print(loginPasswordPrompt);
	}

	
}


