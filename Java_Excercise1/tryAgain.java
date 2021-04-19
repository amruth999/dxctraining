import java.util.*;
public class tryAgain {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean ok = false; 
		char c, choice ;
		do {
			if(ok) {
				System.out.println("Incorrect!");
				System.out.println("Wanna try again?: 'Y' or 'N'");
				choice = in.next().charAt(0);
				if(choice == 'n' || choice == 'N') {
					ok = false;
					break;
				}
			}
			System.out.println("What is the command keyword to exit a loop in Java?");
			System.out.println("a. int");
			System.out.println("b. continue");
			System.out.println("c. break");
			System.out.println("d. exit");
			System.out.println("Enter Your Choice!");
			c = in.next().charAt(0);
			ok = true;
			System.out.println(c);
			
		}while(c != 'c'&& c != 'C');
		
		if(ok)
			System.out.println("Right Answer!!");
		else
			System.out.println("Have a nice day!!");
	}
}
