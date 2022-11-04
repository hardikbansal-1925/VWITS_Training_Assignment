package collections;
import java.util.LinkedList;
public class LinkedListEmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> ml= new LinkedList<Employee>();
		ml.add(new Employee(1002,"Hardik",34500,10));
		ml.add(new Employee(1003,"Harshit",35500,20));
		ml.add(new Employee(1008,"Dipak",30500,22));
		ml.add(new Employee(1009,"Joseph",33500,12));
		
		for (Employee ele:ml)
			System.out.println(ele +"\n");
		
		

	}

}