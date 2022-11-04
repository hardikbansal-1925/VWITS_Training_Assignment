package collections;
import java.util.Comparator;
import customeExceptionEx.Account;
public class ComparatorImplAcc implements Comparator<Account>{
	public int compare(Account e1,Account e2) {
		return (int)(e1.getAccountHolderName().compareTo(e2.getAccountHolderName()));

}
}