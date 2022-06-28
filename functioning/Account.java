package functioning;

import java.util.Scanner;

public class Account {
	private String accnum, pinnum;	
	Scanner sc = new Scanner(System.in);

	//accounts info -to access row
	private	int userId;

	private	int moneydata[]= {525,5000,3000,200,10000};  //peoples money
	private	String database[][]= {			// account_num , pin , name 
			{"986035","4425","SUJIT DUPARE"},
			 {"705888","4483","AMAN"},
			 {"957940","1112","KOMAL"},
			 {"726395","1234","MAYURI"},
			 {"737878","9876","PRANAM"}
	     };
		
		// method for validating user
boolean getlogin() {
		System.out.println("Enter your account number");
		accnum = sc.nextLine();
		boolean find=false;
		for(int i=0;i<database.length;i++) {
			if(database[i][0].equals(accnum)){
			find = true;
			System.out.println("Enter your 4 digit pin");
			pinnum = sc.next();
			sc.nextLine();
			if(database[i][1].equals(pinnum)){
				System.out.println();
				System.out.println("______________________________________");
			  System.out.println("Good Morning  "+database[i][2]);
			    System.out.println("--------------------------------------");
			  userId = i;
			  return true;
			}else 
			  System.out.println("@@ Entered a wrong pin @@");		
				}
		}
			if(!find)
				System.out.println("%% please provide valid account number %%");
			return false;
	}
				
		void balence() {  //showing balence
			System.out.println("	***BALENCE SLIP***");
			System.out.println(database[userId][2]+"  your account balence is  "+moneydata[userId]+" $" );
			System.out.println();
			System.out.println("___successful balence inquiry___");
			System.out.println();
			System.out.println();
		}
		
			void diposit() {   //diposit function
				System.out.println("	***DIPOSIT SLIP***");
			System.out.println("enter ammount to be diposite");	
			moneydata[userId] += sc.nextInt();			
    			System.out.println(database[userId][2]+"  you dipposit is updated balence:    "+moneydata[userId]+" $");
    			System.out.println();
				System.out.println("___successful deposite___");
				System.out.println();
				System.out.println();
			}
			
	void withdraw() {   //withdraw function
		System.out.println("	***WIDRAW SLIP***");
		System.out.println("enter amount to be withdraw");
		int dollers = sc.nextInt();
					if(moneydata[userId] < dollers){
		     System.out.println(" you have less balence  "+moneydata[userId]+" $");				
					}else {						
		moneydata[userId] -= dollers;
		 System.out.println(database[userId][2]+"  your withdraw is updated total money:   "+moneydata[userId]+" $");
		 System.out.println();
		System.out.println("___successful money withdraw___");
					}
					System.out.println();
					System.out.println();
	}
	
	 void ministate() {   //account mini statement
		System.out.println("_______________________________________");
		System.out.println("MINI STATEMENT");
		System.out.println("---------------------------------------");
		System.out.println("Customer Name:  "+database[userId][2]);
		System.out.println("Account Number: "+database[userId][0]);
		System.out.println("Total Balence:  "+moneydata[userId]);
		
		System.out.println("Successful mini statement ");
		System.out.println("---------------------------------------");
	}
	 
	 
	void pinchange() {  //change old pin number
		System.out.println("Set 4 digit pin number ");
		String newpin = sc.nextLine();
		System.out.println("please enter again to confirm ");
		if(newpin.equals(sc.nextLine())){
			database[userId][1]= newpin;
				System.out.println("&& pin change successful &&");
				System.out.println();
		}else {
			System.out.println("pin is not matching!! could not process your request try again");
			System.out.println();  }
	}

	void displayinfo() {   // display all databaase info 
		System.out.println("Accno.  Pinno.  Name  Balence ");
		for(int y=0;y<database.length;y++) {
			for(int z=0;z<3;z++)
			  System.out.print(database[y][z]+"  ");
		System.out.print(moneydata[y]+" $");
		System.out.println();
	   }
		System.out.println();
		System.out.println();
	}
}//end of class
