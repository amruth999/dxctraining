import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class readFile {
public static void main(String args[])
{
	try {
//		File file = new File("sample.txt");
		FileReader fr = new FileReader("D://sample.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		
		String output, ans;
		
		while((output = br.readLine()) != null) {
			sb.append(output + " ");
		}
		sb.append("\n");
		System.out.println(sb.toString());
		
	}	catch(IOException e){
		e.printStackTrace();
	}
	finally {
		System.out.println("File Read Success!!");
	}
}
}
