package utils;

public class Employee {
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	private int id;
	private String name;
	private int salary;
		public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
