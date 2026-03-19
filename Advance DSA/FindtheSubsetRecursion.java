package StringPackage;

import java.util.ArrayList;
import java.util.List;

public class FindtheSubsetRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find subset using simple method
		subset("", "abc");

		// find subset using ArrayList
		List<String> arrylist = subsetArrayList("", "abc");
		System.out.print(arrylist);

		// find subset with ascii value
		subsetAscii("", "abc");
	}

	private static void subset(String string, String string2) {

		if (string2.isEmpty()) {

			System.out.print(string + " ");
			return;

		}

		char ch = string2.charAt(0);

		subset(string, string2.substring(1));
		subset(string + ch, string2.substring(1));

	}

	private static ArrayList<String> subsetArrayList(String string, String string2) {

		if (string2.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(string);
			return list;

		}

		char ch = string2.charAt(0);
		ArrayList<String> list2 = subsetArrayList(string + ch, string2.substring(1));
		ArrayList<String> list1 = subsetArrayList(string, string2.substring(1));

		list2.addAll(list1);
		return list2;
	}

	private static void subsetAscii(String string, String string2) {

		if (string2.isEmpty()) {

			System.out.print(string + " ");
			return;

		}

		char ch = string2.charAt(0);
		int ascii = string2.charAt(0);
		subsetAscii(string, string2.substring(1));
		subsetAscii(string + ch, string2.substring(1));
		subsetAscii(string + ascii, string2.substring(1));
	}

}
