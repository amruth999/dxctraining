import java.io.*;
import java.util.*;
public class CheckAge {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		String ok = (age > 18) ? "You are eligible to vote" : "You not are eligible to vote";
		System.out.println(ok);
	}
}
