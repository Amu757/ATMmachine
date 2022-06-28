package functioning;

public class ATM extends Mainmenu{
	static boolean run=true;

	public static void main(String[] args) {
		Mainmenu menu = new Mainmenu();

//		menu.displayinfo();   //displays full database contains
		menu.innerOption();		
  }
}

/* ACCOUNTNUM PINNUM  USERNAME  BALENCE  
    986035	  4425     SUJIT     525	
	705888 |  4483  |  AMAN	  | 5000  | 
	957940 |  1112  |  KOMAL  | 3000  |
	726395 |  1234  |  MAYURI |  200  |
	737878 |  9876	|  PRANAM | 10000 |
 */