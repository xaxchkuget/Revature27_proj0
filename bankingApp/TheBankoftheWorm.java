package bankingApp;

import java.util.Map;
import java.util.Scanner;

public class TheBankoftheWorm {
	
	static Map<String,WormUser> wormBankuserList;
	static Map<String,WormUser> wormBankemployeeList;
	static Map<String,WormUser> wormBankadminList;
	static Map<String,CustomerAccount> wormAccountList;
	static String dataUserLocation= "C:\\Users\\T3st\\eclipse-workspace\\revatureJava27\\src\\bankingApp\\worm_bank_users.ser";
	static String dataEmployeeLocation= "C:\\Users\\T3st\\eclipse-workspace\\revatureJava27\\src\\bankingApp\\worm_bank_employees.ser";
	static String dataAdminLocation= "C:\\Users\\T3st\\eclipse-workspace\\revatureJava27\\src\\bankingApp\\worm_bank_admin.ser";
	static String dataaccountlistLocation= "C:\\Users\\T3st\\eclipse-workspace\\revatureJava27\\src\\bankingApp\\wormAccountList.ser";
	static int selection;
	public static int loop;
	public static String userstringinput1;
	public static String userstringinput2;
	public static boolean accepted;
	public static Scanner initialInput= new Scanner(System.in);

	
	public static void main(String[] args) {
		
		
		//Display Welcome Screen:
		Menus.showMainMenu();

			
		//Accept Initial user input:
		loop = 0;
		selection = MenuSelections.MainMenuInputSolver(loop,initialInput);
			
		//Build user list
		wormBankuserList = WormReadFromFile.WormUsersRead(dataUserLocation);
		wormBankemployeeList = WormReadFromFile.WormUsersRead(dataEmployeeLocation);
		wormBankadminList = WormReadFromFile.WormUsersRead(dataAdminLocation);
		wormAccountList = WormReadFromFile.WormAccountRead(dataaccountlistLocation);

		switch(selection) {
		
		
		case 1:
//			testAdmin3@email
			loop=0;
			userstringinput1=null;
			Menus.loginuserNamePrompt();
			userstringinput1=MenuSelections.GeneralInputSolver(loop, initialInput);

		// Authenticate Admin:
			loop=0;
			accepted=false;
			
			accepted=WormAuthenticator.AdminUserNameAuthenticator(userstringinput1,loop);
			System.out.println(TheBankoftheWorm.wormBankadminList.get(userstringinput1).getusername());
			loop=0;
			accepted=false;
	     	userstringinput2=null;
	     	//testAdminpassword3
			Menus.loginPasswordPrompt();
			userstringinput2=MenuSelections.GeneralInputSolver(loop, initialInput);
			accepted=WormAuthenticator.AdminPasswordAuthenticator(userstringinput1, userstringinput2,loop);

			//Display Admin:
			loop=0;
			accepted=false;
			selection=0;
			Menus.showadminMenu1();

				//Accept Admin input
				selection=MenuSelections.Generic4SelectionMenuSolver(loop,initialInput);
				//Determine Admin choices
				switch(selection) {
				
				case 1:
					loop=0;
					userstringinput1=null;
					System.out.println("enter a customer email/username");
					//testcustomer2@email
					userstringinput1=MenuSelections.GeneralInputSolver(loop, initialInput);
					accepted=false;
					accepted=WormAuthenticator.CustomerUserNameAuthenticator(userstringinput1,loop);
					System.out.println(TheBankoftheWorm.wormBankuserList.get(userstringinput1));
					String currentaccount=TheBankoftheWorm.wormBankuserList.get(userstringinput1).getaccount();
					// TODO 	
					// Return Display Admin2:
					Menus.showadminMenu2();
					selection=0;
					selection=MenuSelections.Generic4SelectionMenuSolver(loop,initialInput);
					switch(selection) {

					case 1:
						//TODO
						Menus.showWomrwithdrawl();
						selection = MenuSelections.GeneralIntSolver(loop,initialInput);
						TheBankoftheWorm.wormAccountList.get(userstringinput1).setBalanceafterwithdrawal(200);
					case 2:
						Menus.showWormdeposit();
						selection = MenuSelections.GeneralIntSolver(loop,initialInput);
						TheBankoftheWorm.wormAccountList.get(userstringinput1).setBalanceafterwithdrawal(200);

					case 3:
						//TODO 
						// 1111111111
						Menus.showWormtransfer1();
						userstringinput1=MenuSelections.GeneralInputSolver(loop, initialInput);
						WormAuthenticator.TransferAccountAuthenticator(userstringinput1, loop);
						Menus.showWormtransfer2();
						selection=MenuSelections.GeneralIntSolver(loop,initialInput);

					
					case 4:
						main(args);

					};
					break;
					
				case 2:
					loop=0;
					userstringinput1=null;
					System.out.println("enter a employee email/username");
					userstringinput1=MenuSelections.GeneralInputSolver(loop, initialInput);
					accepted=false;
					accepted=WormAuthenticator.EmployeeUserNameAuthenticator(userstringinput1,loop);
					System.out.println(TheBankoftheWorm.wormBankuserList.get(userstringinput1));
					// TODO 	
					// Return Display Admin2:
					Menus.showadminMenu2();
					break;

				case 3:
					// TODO 	
					System.out.println("Printing open applications");
					break;

				case 4:
					main(args);


				}
//			
//		case 2:
//			loop=0;
//			userstringinput=null;
//			Menus.loginuserNamePrompt();
//			userstringinput=MenuSelections.GeneralInputSolver(loop, initialInput);
//
//		// TODO 
//		// Authenticate employee:
//			loop=0;
//			accepted=false;
//			accepted=WormAuthenticator.AdminUserNameAuthenticator(userstringinput,loop);
//			WormAuthenticator.GeneralAuthenticator(accepted);
//			loop=0;
//			accepted=false;
//			userstringinput=null;
//			userstringinput=MenuSelections.GeneralInputSolver(loop, initialInput);
//			accepted=WormAuthenticator.AdminPasswordAuthenticator(userstringinput,loop);
//			//Display Admin:
//			Menus.showadminMenu1();
//			// TODO
//			//Display Employee:
//				// TODO 	
//				//Accept Employee input
//				
//				// TODO 	
//				//Determine Employee choices
//		
//				// TODO 	
//				// Return Display Employee:
//			break;
//			
//		case 3:
//			loop=0;
//			userstringinput=null;
//			Menus.loginuserNamePrompt();
//			userstringinput=MenuSelections.GeneralInputSolver(loop, initialInput);
//
//		// TODO	
//		// Authenticate customer:
//			loop=0;
//			accepted=false;
//			accepted=WormAuthenticator.AdminUserNameAuthenticator(userstringinput,loop);
//			WormAuthenticator.GeneralAuthenticator(accepted);
//			loop=0;
//			accepted=false;
//			userstringinput=null;
//			userstringinput=MenuSelections.GeneralInputSolver(loop, initialInput);
//			accepted=WormAuthenticator.AdminPasswordAuthenticator(userstringinput,loop);
//			//Display Admin:
//			Menus.showadminMenu1();
//			//Display Customer:
//				// TODO 	
//				//Accept Customer input
//				
//				// TODO 	
//				//Determine Customer choices
//		
//				// TODO 	
//				// Return Display Customer:
//			break;
//			
//		case 4:
//			loop=0;
//			userstringinput=null;
//			Menus.loginuserNamePrompt();
//			userstringinput=MenuSelections.GeneralInputSolver(loop, initialInput);
//
//		// TODO
//		//Display NewCustomer:
//			// TODO 	
//			//Accept NewCustomer input
//			
//			// TODO 	
//			//Determine NewCustomer choices
//			
//				// TODO 	
//				// Display Non-Joint:
//	
//					// TODO 	
//					//Accept Customer input
//	
//	
//				// TODO 	
//				// Display Joint:
//					// TODO 	
//					//Accept Customer1 input
//	
//					// TODO 	
//					//Accept Customer2 input
//	
//		
//				// TODO 	
//				// Return Display Customer:
//			break;
//			
//		case 5:
//			Menus.showMainMenu();
//
//			// TODO 	
//			//Determine if user is finished:
//			
//			
//			// TODO 		
//			//Display Exit Screen:
//			
//			break;
		}
		// TODO 	
		//Insure changes are saved and file cleanup:



		
		
		// TODO 	
		//Return to Welcome Screen:
		main(args);
	}

}
