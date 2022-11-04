package collections;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		//lst.add("abcbc");
		lst.add(100); //new Integer(100) -> autoboxing - box the primitive into object type
		lst.add(80);
		lst.add(30);
		
		//lst.add("java");
		lst.add(90);
		lst.add(78);
		
		System.out.println(lst); //lst.toString
		
		int no = (int)lst.get(0); //new Integer(100)->intvalue() -> auto-unboxing - unbox integer object to its primitve. 
        System.out.println("value at index position 0:" + no);
	    
        System.out.println(lst.size());
        lst.remove(0);
        lst.set(0, 130);
        System.out.println(lst);
        System.out.println(lst.size());
        lst.add(10);
        
        boolean isPresent = lst.contains(130);
        System.out.println("Integer value 130 is present in the list? = " +isPresent);
        
	}

}
