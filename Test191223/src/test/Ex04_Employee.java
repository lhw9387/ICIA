package test;

public class Ex04_Employee {

	String name;
	String address;
	int salary;
//	private int salary; // private 사용x
	
	Ex04_Employee() {
	}

	@Override
	public String toString() {
		return "Ex04_Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
