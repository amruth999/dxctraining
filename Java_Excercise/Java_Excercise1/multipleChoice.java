import java.util.*;
public class multipleChoice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		System.out.println("Choose Your Answer:");
		char ans = in.next().charAt(0);
		while(true)
		{
			if(ans == 'b' || ans == 'B')
				break;
			System.out.println("Wrong Answer! Try Again!...");
			ans = in.next().charAt(0);
			
		}
		System.out.println("Right Answer!");
	}
}
