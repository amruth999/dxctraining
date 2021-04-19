import java.util.HashMap;
public class findDuplicates {
	public static void main(String[] args)
	{
		String[] a = {"prasad", "acharya", "acharya", "Prasad"};
		HashMap<String, Integer> visited = new HashMap<>();
		for(int i = 0; i < a.length; i++)
		{
			if(visited.get(a[i]) == null){
				visited.put(a[i], 1);
			}
			else
			{
				visited.put(a[i], visited.get(a[i])+1);
				System.out.println("String --->" + a[i] + " repeated : " + visited.get(a[i]) + " Times.");
			}
		}
	}
}
