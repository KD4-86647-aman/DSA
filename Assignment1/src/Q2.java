import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to search : ");
		int key = sc.nextInt();
		int arr[] = new int[5];
		System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < 5; i++) {
	            if (sc.hasNextInt()) {
	                arr[i] = sc.nextInt();
	            }
	        }
		linear(arr,key);
		binary(arr,key);
		sc.close();
	}

	public static void linear(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count ++;
			if(key == arr[i])
				break;
		}
		System.out.println("comparisions Done in Linear Search : "+count);	
	}
	
	public static void binary(int arr[],int key) {
	int count = 0;
	int left = 0,right = arr.length,mid;
	while(left<=right) {
		mid = (left+right)/2;
		count++;
		if(key == arr[mid])
			break;
		else if(key < arr[mid])
			right = mid-1;
		else
			left = mid+1;
			
	}
	System.out.println("comparisions Done in Binary Search : "+count);
	}
}
