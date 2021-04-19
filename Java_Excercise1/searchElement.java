import java.util.Scanner;
public class searchElement {
    static int binary_search(int a[],int l,int r,int key) {
        if(r >= l) {
            int mid = l + (r - l) / 2;
            if(a[mid] == key)
            {
                return 1;
            }
            
            if(a[mid] > key) {
                return binary_search(a, l, mid - 1, key);
            }
            else {
                return binary_search(a, mid + 1, r, key);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[] = { 2, 3, 4, 10, 40 };
        int size = arr.length;
        System.out.println("Enter the element to be searched!");
        int key = in.nextInt();
        int out = binary_search(arr, 0, size, key);
        if(out == -1)
        {
            System.out.println("Element not found!");
        }
        else 
        {
            System.out.println("Element found!");
        }
    }
}
