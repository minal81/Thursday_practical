import java.io.*;

class Rotation {
	
	public static void Rotation(int arr[], int r, int n)
	{
		int p = 1;
		while (p <= r) {
			int last = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = last;
			p++;
			System.out.print( " \n ");
			for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "  ");
		}
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.print("original array \n");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		int N = arr.length;
		int r = 5;
		System.out.print("\n after rotation array  ");
		rotate(arr, r, N);
	
	}
}
