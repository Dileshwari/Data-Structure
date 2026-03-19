package Dileshwari;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Dile";
		String name1 = "Dile";
		if (name == name1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		if (name.equals(name1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		String name2 = new String("Dile");
		String name3 = new String("Dile");
		
		if (name2 == name3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if (name2.equals(name3)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		for(int i=0;i<26;i++) {
			
			char ch=(char)('a'+i);
			System.out.print(ch+" ");
			
		}
	}

}
