package chapter5.oop.good;

public class Employee {

	private String name;
	protected double salary;

	public Employee() {
		super();
	}

	//생성자 추가
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
	    return this.name;
	}

	public double getSalary() {
	    return this.salary;
	}

}