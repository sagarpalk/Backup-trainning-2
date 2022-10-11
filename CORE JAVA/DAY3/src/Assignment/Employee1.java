package Assignment;

public class Employee1 {
 int id;
 String name;
 int salary;
 Date dob;
 
 public Employee1(int id, String name, int salary,Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		 this.dob=dob;
	}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}




}
