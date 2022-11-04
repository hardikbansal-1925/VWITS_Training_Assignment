package collections;

import java.util.*;

public class EmpComMain {

	public static void main(String[] args) {
		Comparator<Employee> c = new ComparatorImpl();
		SortedSet<Employee> set = new TreeSet<Employee>(c);
		
		Employee e = new Employee(1001,"Hardik",34000,10);
		Employee e1 = new Employee(1008,"Abhinav",55000,20);
		Employee e2 = new Employee(1045,"Saurab",89000,40);
		Employee e3 = new Employee(1024,"Yamini",45000,23);
		Employee e4 = new Employee(1089,"Karan",75000,34);
		
		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(set);
		System.out.println(set.size());
		
		
		

	}

}
