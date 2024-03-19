package cgAssignment4;

abstract class Employee {
	String name;
	int age;
	String department;
	float salary;
	
	
	public Employee() {
		
	}
	public Employee(String name, int age, String department, float salary) {
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary=salary;
	}
	
	public abstract void Job();
}
