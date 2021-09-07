package bankingApp;

public abstract class WormAuthenticator {
	
	
	public static boolean CustomerUserNameAuthenticator(String arg, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankuserList.get(arg).getusername().equals(arg) ) {
				System.out.println("Username Accepted.\n");
			}else {
			
				System.out.println("The Username you entered did not match whats in the system.\n"
					+ "Please try again.");
				CustomerUserNameAuthenticator(arg,arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is Very disspleased, but you can try again later.\n");
		return false;
		}
	}
	
	public static boolean CustomerUserPasswordAuthenticator(String arg, String arg3,int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankuserList.get(arg).getpassword() != null  ) {
				System.out.println("Password Accepted.\n");
			}else {
			
				System.out.println("The password you entered did not match whats in the system.\n"
					+ "Please try again.");
				CustomerUserPasswordAuthenticator(arg, arg3, arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is dissapointed, but you can try again later.\n");
		return false;
		}
	}
	
	public static boolean EmployeeUserNameAuthenticator(String arg, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankemployeeList.get(arg).getusername() != null  ) {
				System.out.println("Password Accepted.\n");
			}else {
			
				System.out.println("The Username you entered did not match whats in the system.\n"
					+ "Please try again.");
				EmployeeUserNameAuthenticator(arg,arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is dissapointed, but you can try again later.\n");
		return false;
		}

	}
	
	public static boolean EmployeePasswordAuthenticator(String arg,String arg3, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankemployeeList.get(arg).getpassword() != null  ) {
				System.out.println("Password Accepted.\n");
			}else {
			
				System.out.println("The password you entered did not match whats in the system.\n"
					+ "Please try again.");
				EmployeePasswordAuthenticator(arg, arg3, arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is dissapointed, but you can try again later.\n");
		return false;
		}

	}
	
	public static boolean AdminUserNameAuthenticator(String arg, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankadminList.get(arg).getusername().equals(arg) ) {
				System.out.println("Username Accepted.\n");
			}else {
			
				System.out.println("The Username you entered did not match whats in the system.\n"
					+ "Please try again.");
				AdminUserNameAuthenticator(arg,arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is Very disspleased, but you can try again later.\n");
		return false;
		}

	}
	
	
	public static boolean AdminPasswordAuthenticator(String arg,String arg3, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankadminList.get(arg).getpassword().equals(arg3)  ) {
				
				System.out.println("Password Accepted.\n");
			}else {
			
				System.out.println("The password you entered did not match whats in the system.\n"
					+ "Please try again.");
				AdminPasswordAuthenticator(arg,arg3,arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. The Worm is dissapointed, but you can try again later.\n");
		return false;
		}
	
	}
	
	public static boolean NewCustomerAuthenticator(String arg, int arg2) {
		
		if( TheBankoftheWorm.wormBankadminList.get(arg).getemail() != null  ) {
			
			System.out.println("This email has already been registered in our system.");

			return false;
		}else {
			
			System.out.println("Thank you!.");
			return true;
		}
		
	}
	
	public static void GeneralAuthenticator(boolean arg) {
		
		if(arg==true) {
			
			
			
		}else {
			
			System.exit(2);
		}
		
		
	}
	
	public static boolean TransferAccountAuthenticator(String arg, int arg2) {
		arg2++;
		if(arg2 <= 3) {
			if( TheBankoftheWorm.wormBankuserList.get(arg).getpassword() != null  ) {
				System.out.println("Account Accepted.\n");
			}else {
			
				System.out.println("The account you entered did not match any in the system.\n"
					+ "Please try again.");
				TransferAccountAuthenticator(arg, arg2);
			}
		return true;
		}else {
			System.out.println("Too Many attempts. try again later.\n");
		return false;
		}
	}
}