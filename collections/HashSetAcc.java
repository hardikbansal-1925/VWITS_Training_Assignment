package collections;

import java.util.HashSet;
import java.util.Set;
import customeExceptionEx.Account;
public class HashSetAcc {

	public static void main(String[] args) {
		Set<Account> sst = new HashSet<Account>();
		Account ac = new Account("Hardik",10135,34000);
		sst.add(ac);
		Account ac1 = new Account("Himanshu",10316,67000);
	    sst.add(ac1);
	    sst.add(new Account("manav",10021,35000));
		sst.add(new Account("Hardik",10135,34000));
		System.out.println(sst);
		System.out.println(sst.size());
	}

}
