package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListC {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(2);
		list.add(50);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(1);
		display(list);
		list.add(366);
		display(list);
		list.remove(4);
		display(list);
		System.out.println(list.size());
		System.out.println(list.get(8));

	}

	private static void display(List<Integer> list) {
		if (!list.isEmpty()) {

			System.out.println(list);
		}
		

	    List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(50);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(10);
		list1.add(1);
		
	     long newArrayList= list1.stream().filter(x-> x>20).count();
		System.out.println("newArrayList: "+newArrayList);
		
		
		String[] arr= {"A", "B","c","d"};
		Stream<String> streamArray = Arrays.stream(arr);
		System.out.println("streamArray: "+streamArray.count());
		
		Stream<Integer> streamDetails = Stream.of(10, 40, 3, 80, 50);
		System.out.println("streamDetails: "+streamDetails.count());
		
		
		

	}

}
