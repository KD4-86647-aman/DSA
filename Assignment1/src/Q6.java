public class Q6 {

	public static void main(String[] args) {
		int arr[] = {1, 2,  -1, 2, 1,3, 0, 4, -1, 7, 8};
		int a = liner(arr);
		System.out.println("First Non-Repeating Element is : "+a);
	}
	
	private static int liner(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])
					count ++;
			}
			if(count == 1)
				return arr[i];
		}
		return 0;
		
	}

}
