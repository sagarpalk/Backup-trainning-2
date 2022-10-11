package demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comaparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>li=new ArrayList<>();
		li.add(new Employee("sagar", "saving",34345));
		li.add(new Employee("xyz", "saving", 7878));
		li.add(new Employee("iki", "saving", 45455));
		li.add(new Employee("sds", "saving", 8000));
		li.add(new Employee("yhy", "saving", 787));
		
//		Collections.sort(li,(employee1,employee2)->Employee;
		for(Employee emp:li) {
			System.out.println(emp);
		}

	}

}
