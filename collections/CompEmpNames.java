package collections;

import java.util.*;

public class CompEmpNames implements Comparator<Employee>{

	
		public int compare(Employee e1,Employee e2) {
			return (int)(e1.getEmpname().compareTo(e2.getEmpname()));
		}
}
		
		

	

