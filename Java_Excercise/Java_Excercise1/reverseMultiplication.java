public class reverseMultiplication {
	public static void main(String[] args) {
		int a[][]={{8,9,5},{5,6,3},{4,9,7}};  
		int b[][]={{6,8,10},{12,4,5},{3,17,20}}; 
		int res[][]=new int[3][3];
		
		for(int i = 0, j = 2; i < 3;i++, j--) {
			for(int k = 0, l = 2; k < 3; k++, l--) {
				res[i][k] = a[i][k] * b[j][l];
			}
		}
		System.out.println("Resultant array:");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
