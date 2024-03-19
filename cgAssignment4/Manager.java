package cgAssignment4;

public class Manager extends Employee {
	
	public Manager() {
		
	}
	public Manager(String name, int age, String department, float salary) {
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary=salary;
	}
	@Override
	public void Job() {
		System.out.println("Manager");
	}
}
