package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Employee,Double> smp = new TreeMap<Employee,Double>();
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
         smp.put(e1,e1.getSalary());
         
         Employee e = new Employee(1,"Anubhav Sinha",15000,10);
         smp.put(e,e.getSalary());
         
         smp.put(new Employee(3,"Sangeeta Shah",35000,20),35000.0);
         smp.put(new Employee(2,"Raj Malhotra",25000,10),25000.0);
         
         System.out.println(smp);
         
         
         
	}

}
