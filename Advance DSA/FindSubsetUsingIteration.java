package StringPackage;

import java.util.ArrayList;
import java.util.List;

public class FindSubsetUsingIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = subset("", "123");
		System.out.println(l);

	}

	private static ArrayList<String> subset(String string, String string2) {
		if (string2.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(string);
			// System.out.print(string + " ");
			return list;

		}

		char ch = string2.charAt(0);
		ArrayList<String> left = subset(string + ch, string2.substring(1));
		ArrayList<String> right = subset(string, string2.substring(1));
		left.addAll(right);
		return left;

	}

}
