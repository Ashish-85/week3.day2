package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "PayPal India";

		char[] charArray = str.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (char ch : charArray) {

			set.add(ch);

		}

		for (char d : set) {
			if (d != ' ') {
				System.out.print(d);
			}

		}

	}

}
