package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public void name() {

		System.out.println("This is a method from LearnSet class");

	}

	public static void main(String[] args) {

		Set<String> name = new HashSet<String>();

		List<String> list = new ArrayList<String>();
		list.add("ListChar");
		list.add("Listchar2");

		boolean add = name.add("Ashish");

		System.out.println(add);
		name.add("Sathish");
		name.add("Kiran");
		name.add("Babu");
		name.remove("Babu");
		name.add("Just Delete");

		list.addAll(name);

		System.out.println(list);
		System.out.println(name);

		Collections.sort(list);
		System.out.println(list);

		System.out.println(list);
		boolean add2 = name.add("Ashish");

		System.out.println(add2);

		System.out.println(name);

		boolean empty = name.isEmpty();

		System.out.println(empty);

	}

}
