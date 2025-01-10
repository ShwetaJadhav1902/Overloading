package com.overloading;

public class MainEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee(123,"shweta",45000,65788,85758);
		System.out.println("number of object:"+Employee.count);
		Employee emp1=new Employee(123,"shweta",45000,74562,83653);
		System.out.println("number of object:"+Employee.count);
		Employee emp2=new Employee(123,"shweta",45000,29639,07353);
		System.out.println("number of object:"+Employee.count);
		Employee emp3=new Employee(123,"shweta",45000,9375,2825);
		System.out.println("number of object:"+Employee.count);
	}

}
