package functioning;
public class Mainmenu extends Account {
   //options to be shown 1st
private	boolean mainOptions() {
		System.out.println("**welcome to SBI**");
		System.out.println("Enter account type");
		System.out.println("press 1: current account");
		System.out.println("press 2: saving account");
		System.out.println("press 3: Exit");
		boolean run = false;
	
			int opt = sc.nextInt();
			sc.nextLine();
			switch(opt) {
			case 1:
				getlogin();        //validating 
				innerOption();    // give other options 
			  break;
			case 2:
				getlogin();  //validating 
				innerOption(); // give other options 
			  break;
			case 3:
				System.out.println("Thanks for using SBI ATM !! "); //exit
				run= false;
				break;
			default:
			System.out.println("invalid input only numbers are valid ");
			System.out.println("please take your card try again ");
			run=false; 
			break;
			}
			return run; //if valid input get repeat
	}
		
	void innerOption() {    //inside options
		int choice;
		do{
System.out.println("please enter a service");	
System.out.println("1: Balence Inquairy 	      2: Deposite");
System.out.println("3: Money withdraw             4: mini statement");
System.out.println("5: pin change                 0: Exit  !!");
		
		choice = sc.nextInt();
		sc.nextLine();           //reduce ambiguity string input after a int 
		
		switch(choice){
		case 0:		
			System.out.println("THANKS for using SBI !!");
			break;  //exit
		case 1:
			if(getlogin())   //if login is valid then runs next function
				balence();			    
			break;
		case 2:
		if(getlogin())
			diposit();
			break;
		case 3:
		if(getlogin())
			withdraw();
			break;
		case 4:
		if(getlogin())
			ministate();
			break;
		case 5:
		if(getlogin())
			pinchange();
			break;
		default:
			System.out.println("invlaid input ##");
			choice=1; //to repeat loop
			break;
		  }		
	 	}while(choice > 0 && choice < 6);	
	 }//end of function
   }//end of class
