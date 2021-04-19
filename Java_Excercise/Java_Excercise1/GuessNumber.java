import java.util.*;
public class GuessNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		while(num <= 9 && num >= 0) {
			System.out.println(num);
			num = in.nextInt();
		}
		System.out.println("not allowed");
	}
}
