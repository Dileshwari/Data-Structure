import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaFirst {
	
	public static void main(String[] args) {
		
//		System.out.print("Khushi deshmukh first print class");
//		int a =10;
//		int b=20;
//		int c=a+b;
//		System.out.println(c);
//		
//		
//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("enter the value of s1: ");
//		int s1= sc.nextInt();
//
//		
//
//		System.out.println("enter the value of s2: ");
//		int s2= sc.nextInt();
//		System.out.println("value of s1+s2 is: "+(s1+s2));
//		
//		
//		int k=20;
//		int l=30;
//		k =k+l;
//		 l=k-l;
//		 k=k-l;
//		 System.out.println("value of k: "+k);
//		  System.out.println("value of l: "+l);
//		  
//		  
//		  int z=10;
//		  int x=-920;
//		  int v=30;
//		  
//		  if(z>x && z>v) {
//			  
//			  System.out.println("z is largest number");
//			  
//		  } if(x>z && x>v) {
//			  
//			  System.out.println("x is largest number");
//		  } 
//		  else {
//			  System.out.println("v is largest number");
//		  }
//		  
//		  
//		  
//		  Integer i=null;
//		  int j=i;
//		  System.out.println("value of j is: "+j);
//		  System.out.println("value of i is: "+i);
//		  
//		  
		  //String reverse
//		  
//		  StringBuilder str=new StringBuilder("Dileshwari");
//		  System.out.println("reverse of string is: "+str.reverse());
//		  
//		  String s="Deshmukh";
//		  for(int i=s.length()-1;i>=0;i--) {
//			  System.out.print(s.charAt(i));
//			  
//		  }
//		  System.out.println("");
//		  
//		  
//		  
//		  String str1="Diileshwari Deshmukh";
//		  String str2="";
//		  char ch;
//		  
//		  for(int i=0;i<str1.length();i++) {
//			  
//			  ch=str1.charAt(i);
//			  str2=ch+str2;
//		  }
//		  
//		  if(str2==str1) {
//			  
//			  System.out.println("pelindrome");
//		  }
//		  else {
//			  
//			  System.out.println("not pelindrome");
//		  }
//		  
		  
		  
		 List<String> list= new ArrayList<>(); 
		 list.add("khushi");
		 list.add("Deshmukh");
		 list.add("min");
		 list.add("ab");
		 
		 List<Integer> lengthDetails= list.stream().map(x->x.length()).collect(Collectors.toList());
		 System.out.println(lengthDetails);
		 List<Integer> sortDetails= lengthDetails.stream().sorted().collect(Collectors.toList());
		 System.out.println(sortDetails);
		 List<Integer> descDetails = sortDetails.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println(descDetails);
		 
		 int d= descDetails.stream().mapToInt(c->c).sum();
		 System.out.println(d);
		 
		  
		  
		  
	}

}
