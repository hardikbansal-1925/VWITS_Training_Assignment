package collections;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sortset = new TreeSet<String>();
		
		sortset.add("Hardik");
		sortset.add("Aryan");
		sortset.add("Joseph");
		sortset.add("Priyanshi");
		sortset.add("Yamini");
		
		System.out.println(sortset);
		sortset.add("Chirag");
		
		System.out.println(sortset);
		System.out.println(sortset.size());
		System.out.println(sortset.contains("Priyanshi"));
		

	}

}
