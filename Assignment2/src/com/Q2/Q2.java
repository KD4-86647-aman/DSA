package com.Q2;

public class Q2 {
	
	public static void main(String[] arg) {
		
	Employee e[] = new Employee[5];
	e[0] = new Employee(1,"Yash",5000);
	e[1] = new Employee(2,"Amit",2000);
	e[2] = new Employee(3,"Sumit",4000);
	e[3] = new Employee(4,"Suraj",1000);
	e[4] = new Employee(5,"Anil",3000);
	
	bubble(e);
	for(int i=0;i<5;i++)
		System.out.println(e[i]);

	}
	
	private static void bubble(Employee []e) {
		for(int i=0;i<e.length;i++) {
			for(int j= 0;j<e.length-1;j++ ) {
				if(e[j+1].getSal()<e[j].getSal()) {
					Employee temp = e[j];
					e[j] = e[j+1];
					e[j+1] = temp;
				}
			}
		}

	}

}
