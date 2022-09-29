class PositiveNegetive {

	static int[] sort(int[] arr) 
	{
     //sort using QuickSort 
		int last_negative_index = -1;

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < 0) 
			{
				last_negative_index += 1;
				int temp = arr[i];
				arr[i] = arr[last_negative_index];
				arr[last_negative_index] = temp;

			}
		}

		return arr;
	}

	public static void main(String args[]) 
	{
		int[] arr = {  5, -11, 4, -8, 0, -7, 3, -9, -3, 9, -10, 1 };
		System.out.println("before sorting");
		for (int i : arr)
    {
			System.out.print(i + " ");
		}
		
		arr = sort(arr);
		System.out.println("\n after sorting");

		for (int i : arr) 
    {
			System.out.print(i + " ");
		}
	}
}
