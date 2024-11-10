import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 } ;
		System.out.println("Enter Element : ");
		int x = sc.nextInt();
		less(arr,x);
		sc.close();

	}
	
	public static void less(int arr[],int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(x >= arr[i])
				count++;
		}
		System.out.println("Rank of "+x+" is "+count);
	}

}
