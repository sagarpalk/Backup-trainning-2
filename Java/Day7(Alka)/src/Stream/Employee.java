package Stream;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private String name;
	private String account;
	private int salary;

	public Employee(String name, String account, int salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}

}
