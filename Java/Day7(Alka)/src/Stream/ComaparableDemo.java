package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComaparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>li=new ArrayList<>();
		li.add(new Employee("sagar", "saving",34345));
		li.add(new Employee("xyz", "saving", 7878));
		li.add(new Employee("iki", "saving", 45455));
		li.add(new Employee("sds", "saving", 8000));
		li.add(new Employee("yhy", "saving", 787));
		
//	li.stream().filter(emp->emp.getSalary()>29990).forEach(System.out::println);

	//li.stream().filter(emp->emp.getName().startsWith("s")).forEach(System.out::println);
	li.stream().filter(emp->emp.getName().endsWith("z")).forEach(System.out::println);
	

	}

}
