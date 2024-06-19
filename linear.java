class linear{
	public static int search(int arr[], int x)
	{
		int N = arr.length;
		for (int i = 0; i < N; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[] = { 10,18,5,6,25,30 };
		int x = 30;
		int result = search(arr, x);
		if (result == -1)
			System.out.print(
				"Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}
