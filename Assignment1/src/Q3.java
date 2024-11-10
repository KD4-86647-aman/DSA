import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee []arr = new Employee[5];
		arr[0] = new Employee(1, "Yash");
		arr[1] = new Employee(2, "Sumit");
		arr[2] = new Employee(3, "Amit");
		arr[3] = new Employee(4, "Anil");
		arr[4] = new Employee(5, "Suraj");
		findById(arr,sc);
		findByName(arr,sc);
	}
	
	public static void findById(Employee []e,Scanner sc) {
		System.out.println("Enter EMployee Id To Find : ");
		int id = sc.nextInt();
		for(int i=0;i<e.length;i++) {
			if(id == e[i].getEmpid()) {
				System.out.println(e[i]);
			}
		}
	}
	
	public static void findByName(Employee []e,Scanner sc) {
		System.out.println("Enter EMployee Id To Find : ");
		String name = sc.next();
		for(int i=0;i<e.length;i++) {
			if(name.equals(e[i].getName())) {
				System.out.println(e[i]);
			}
		}
	}

}
