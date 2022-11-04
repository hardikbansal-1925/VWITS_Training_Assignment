package collections;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2) {
		//to solve in ascending order
		return (e1.getDeptno()-e2.getDeptno());
	
	}
	
}
	