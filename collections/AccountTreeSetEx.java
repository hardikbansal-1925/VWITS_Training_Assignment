package collections;

import java.util.SortedSet;
import java.util.TreeSet;
import customeExceptionEx.Account;

public class AccountTreeSetEx {

	public static void main(String[] args) {
		SortedSet<Account> s1 = new TreeSet<Account>();
		Account ac = new Account("Hardik",10135,34000);
		s1.add(ac);
		Account ac1 = new Account("Himanshu",10316,67000);
		s1.add(ac1);
		s1.add(new Account("manav",10021,35000));
		s1.add(new Account("Hardik",10135,34000));
		System.out.println(s1);
		s1.add(new Account("Gyan",10098,55000));
		System.out.println(s1);
		System.out.println(s1.size());
	}

}
