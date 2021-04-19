import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class appendIntoFile {
public static void appendStrToFile(String fileName, String str) {
	try {
	BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
	out.write(str);
	out.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	String str = ".A hustler!";
	appendStrToFile("D://sample.txt", str);
	try{
			BufferedReader in = new BufferedReader(new FileReader("D://sample.txt"));
			String ans;
			while((ans = in.readLine()) != null) 
			{
				System.out.println(ans);
			}
			in.close();
		}
	catch(IOException e) {
			System.out.println(e);
	}
}
}

