
// Hashtable was part of the original java.util


/*  Enumeration elements(): return an enumeration of values
	Enumeration keys()
	void clear()
	Object clone()
	Object get()
	Object put(Object key, Object Value)
	Object remove(Object key)
*/

import java.util.*;
public class HashTableDemo{
	
	public static void main(String args[]){
		// Create a hash map
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;

		balance.put("zara", new Double(3434.34));
		balance.put("zere", new Double(3));
		balance.put("ziri", new Double(317234.3));
		balance.put("zoro", new Double(34));
		balance.put("zuru", new Double(1));

		// Show all balances in hash table
		names = balance.keys();

		while(names.hasMoreElements()){
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();

		// Deposit 1000 to zara's account
		// 新创建了一个object bal加1000之后以key=zara插入hashtable
		// 不能直接(bal+1000), 因为是在dict中所以不能直接操作value
		bal = ((Double)balance.get("zara")).doubleValue();
		balance.put("zara", new Double(bal+1000));
		System.out.println("zara's new balance: "+ balance.get("zara"));
	}


}