import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {50,40,30,20,10};
		System.out.println("Enter Value you want to find : ");
		int key = sc.nextInt();
		int i =binary(arr,key);
		if(i == -1)
			System.out.println("Element Not Find");
		else
			System.out.println(key+" at "+i);
		sc.close();
	}
	
	public static int binary(int arr[],int key) {
		int left =0,right=arr.length,mid;
		while (left<=right) {
			mid = (left+right)/2;
			if(key == arr[mid] )
				return mid;
			else if(key<arr[mid])
				left = mid-1;
			else
				right = mid+1;
		}
		return -1;
	}

}
