package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Aravind");
		list.add("Vishal");
		list.add("random");

		System.out.println(list.get(0));

		boolean empty = list.isEmpty();

		System.out.println(empty);

		System.out.println(list);

		boolean contains = list.contains("Aravind");

		System.out.println(contains);

		list.remove(1);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
	}

}
