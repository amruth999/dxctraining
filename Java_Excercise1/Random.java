import java.util.Random;
public class random {
	public static void main(String[] args) {
		int i = 0;
		int[] a = new int[100];
		Random rand = new Random();
		while(i < 100) {
			int ele = rand.nextInt(999);
			a[i] = ele;
			System.out.println(a[i]);
			i++;
		}
		for(int x: a)
		{
			System.out.print(x + " ");
		}
		System.out.println("\n");
	}
}
