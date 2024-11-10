import java.util.Scanner;

public class Q1 {

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
		int i = linserch(arr,key);
		if(i == -1) {
			System.out.println("Element Not Found");
		}
		else {
			System.out.println("Element Last Occurance = "+i);
		}
		sc.close();
	}
	
	public static int linserch(int arr[],int key) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(key == arr[i])
				index = i;
		}
		return index;
	}

}
