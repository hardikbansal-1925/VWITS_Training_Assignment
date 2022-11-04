package collections;

import java.util.*;

import classesobjects.Employee;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> st = new HashSet<Employee>();
		Employee e1 = new Employee(2,"Raj",25000,10);
		st.add(e1);
		Employee e2 = new Employee(1,"Anuj",15000,10);
		st.add(e2);
		st.add(new Employee(3,"Sangeeta",35000,10));
		st.add(new Employee(2,"Raj",25000,10));
		System.out.println(st);
		System.out.println(st.size());
	}

}
