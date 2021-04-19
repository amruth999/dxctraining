import java.util.StringTokenizer;

public class stringTokenizer {
public static void main(String[] args) {
	String delim = " ";
	String str = "Hello im prasad nice to meet you!";
	StringTokenizer tok = new StringTokenizer(str, delim);
	int count = tok.countTokens();
	System.out.println("Total tokens: " + count);
	for(int i = 0; i < count; i++) {
		System.out.println(tok.nextToken());
	}
}
}
