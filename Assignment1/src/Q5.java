import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key You Want To Search : ");
		int key = sc.nextInt();
		System.out.println("Enter Key You Want To Search at which occerence : ");
		int oc = sc.nextInt();
		int arr[]= {10,20,30,40,50,30};
		int a = linear(arr,key,oc);
		System.out.println(oc+"th Occurense of "+key+" at "+a);
		sc.close();
	}
	
	public static int linear(int arr[],int key,int oc) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				count++;
				if(count == oc)
					return i;
			}
		}
		return -1;
		
	}

}
