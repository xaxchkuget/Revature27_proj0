package bankingApp;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class MenuSelections {
	
//	private Scanner wormBankUserInput= new Scanner(System.in);
//	
//	private Scanner customerUserInput2= new Scanner(System.in);
//
//	private Scanner employeeUserInput= new Scanner(System.in);
//
//	private Scanner AdminustomerUserInput= new Scanner(System.in);
	
	// based on initial user input from main screen; solves and insures user input is allowable 
	// before passing information to main. 
	// throws error if detected user input is not allowed or 
	public static int MainMenuInputSolver (int arg, Scanner initialInput) throws WormBankExceptions, InputMismatchException{
		
		int userChoice = 0;
				
		try {
			arg++;
			userChoice = initialInput.nextInt();
			initialInput.nextLine();
			
			switch(userChoice) {
			case 1: System.out.println("Taking you to the Admin Login screen.");
			break;
			case 2: System.out.println("Taking you to the Employee Login screen.");
			break;
			case 3: System.out.println("Taking you to the Customer Login screen.");
			break;
			case 4: System.out.println("Taking you to the New Customer menu.");
			break;
			case 5: System.out.println("Come Again some time! And remember the worm loves you, "
									  +"and because it always has...\n It Always will.");
			initialInput.close();
			System.exit(0);
			default: 
				initialInput.close();
				throw new WormBankExceptions("Please Input a choice( 1, 2, 3, 4, or 5).\n");
			}
			
		}catch(WormBankExceptions e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {

				System.out.println("Lets try that again.\n");
				MainMenuInputSolver(arg, initialInput);
			}
			
		}catch(InputMismatchException e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {
				System.out.println("Lets try that again.\n");
				MainMenuInputSolver(arg, initialInput);
			}
		}
		return userChoice;
	}
	
	public static String GeneralInputSolver (int arg, Scanner initialInput) throws WormBankExceptions, InputMismatchException{
		
		String userinput = null;
				
		try {
			arg++;
			userinput = initialInput.nextLine();

			if(userinput.equals(null)) {
				
				System.out.println("You didnt enter anything try again.");
				GeneralInputSolver(arg, initialInput);
			}else{
				
				System.out.println("Thank you.\n");
				
			}
			
		}catch(WormBankExceptions e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {
				MainMenuInputSolver(arg, initialInput);
			}
			
		}catch(InputMismatchException e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {
				
				MainMenuInputSolver(arg, initialInput);
			}
		}
		return userinput;
	}
	
	
	public static int Generic4SelectionMenuSolver (int arg, Scanner initialInput) throws WormBankExceptions, InputMismatchException{
		
		int userChoice = 0;
				
		try {
			arg++;
			userChoice = initialInput.nextInt();
			initialInput.nextLine();
			
			switch(userChoice) {
			case 1: System.out.println("");
			break;
			case 2: System.out.println("");
			break;
			case 3: System.out.println("");
			break;
			case 4: System.out.println("Remember the worm loves you, "
									  +"and because it always has...\n It Always will.");
			initialInput.close();
			System.exit(0);
			default: 
				initialInput.close();
				throw new WormBankExceptions("Please Input a choice( 1, 2, 3, 4, or 5).\n");
			}
			
		}catch(WormBankExceptions e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {

				System.out.println("Lets try that again.\n");
				MainMenuInputSolver(arg, initialInput);
			}
			
		}catch(InputMismatchException e) {
			if(arg>=3) {
				System.out.println("Maybe.....The Worm never loved you after all.");
				System.exit(1);
			}
			
			else {
				System.out.println("Lets try that again.\n");
				MainMenuInputSolver(arg, initialInput);
			}
		}
		return userChoice;
	};
	
	public static int GeneralIntSolver (int arg, Scanner initialInput) throws WormBankExceptions, InputMismatchException{
			
			int userChoice = 0;
					
			try {
				arg++;
				userChoice = initialInput.nextInt();
				initialInput.nextLine();
				
				
				
				if(userChoice > 0 ) {
					
					return userChoice;
				}else if(userChoice == 0){
					System.out.println("Come Again some time! And remember the worm loves you, "
						  +"and because it always has...\n It Always will.");

				initialInput.close();
				System.exit(0);
				}else {
					initialInput.close();
					throw new WormBankExceptions("Please input a valid ammount");
				}
			}catch(WormBankExceptions e) {
				if(arg>=3) {
					System.out.println("Maybe.....The Worm never loved you after all.");
					System.exit(1);
				}
				
				else {

					System.out.println("Lets try that again.\n");
					GeneralIntSolver(arg, initialInput);
				}
				
			}catch(InputMismatchException e) {
				if(arg>=3) {
					System.out.println("Maybe.....The Worm never loved you after all.");
					System.exit(1);
				}
				
				else {
					System.out.println("Lets try that again.\n");
					MainMenuInputSolver(arg, initialInput);
				}
			}
			return userChoice;
		}
	
}

