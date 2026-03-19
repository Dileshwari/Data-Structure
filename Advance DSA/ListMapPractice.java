

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListMapPractice {
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(1);
        list.add(21);
        list.add(12);
        list.add(31);
        list.add(11);
        list.add(16);
        list.add(17);
        list.add(19);
        list.add(19);
        list.add(19);
        list.add(19);
        System.out.println(list);
        list.add(2, 10);
        list.set(3, 30);
        System.out.println(list.size());
        System.out.println(list.add(20));
        System.out.println(list.contains(23));
        System.out.println(list.contains(31));

        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);


        //add list
       long o =list.stream().reduce((p, e)->p+e).get();
       System.out.println("add list: "+o);

       //add list
       int k=list.stream().reduce(0,(p,e)->p+e);
       System.out.println(k);


       int v=list.stream().mapToInt(e->e).sum();
       System.out.println(v);


       //sort list
       List<Integer> so=list.stream().sorted().collect(Collectors.toList());
       System.out.println(so);

       //sort list in reverse order
       List<Integer> revers=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println(revers);

       //frequency
       Map<Integer, Long> fre=list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(fre);

       //avg
       double avg=list.stream().mapToInt(e->e).average().getAsDouble();
       System.out.println(avg);


       //square of each number
       List<Integer> square=list.stream().map(x->x *x).collect(Collectors.toList());
       System.out.println(square);


       //even numner
       List<Integer> even=list.stream().filter(x->x%2==0).collect(Collectors.toList());
       System.out.println(even);

       //min
       int i=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(i);

       //max
       int j=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(j);

       System.out.println(list);

       //second lasrget value
       int largest=list.stream().sorted().distinct().skip(1).findFirst().get();
       System.out.println(largest);

       //string playing


       List<String> str= Arrays.asList("ABC", "BCA","KHUSHI","ABC");
       System.out.println(str);

       //sort the string
       List<String> s=str.stream().sorted().collect(Collectors.toList());
       System.out.println(s);

       //count the frequency
       Map<String, Long> f=str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(f);

       Map<String, Long> counts =str.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
       System.out.println(counts);
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       List<Employees> emp = Arrays.asList(new Employees("khushi", 2, 10000), new Employees("deshmukh", 23, 200),
    		   new Employees("mimi", 45, 30000000), new Employees("tribhuvan", 57, 20000),
    		   new Employees("ekta", 20, 10000));
       
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       //print list of employee
       List<Employees> table=emp.stream().collect(Collectors.toList());
       System.out.println("table :  "+table);

       //println the name of employee
      List<String> e=emp.stream().map(x->x.getName()).collect(Collectors.toList());
      System.out.println(e);


      //print the employee name whose age is greather than 23
      List<String> p=emp.stream().filter(x->x.getAge()>23).map(x->x.getName()).collect(Collectors.toList());
      System.out.println(p);

      //print the name of employee whose name is not mimi
      List<String> li=emp.stream().filter(x->!x.getName().equals("mimi")).map(x->x.getName()).collect(Collectors.toList());
      System.out.println(li);

      //print the employee name in sorting order
      List<String> nm=emp.stream().sorted(Comparator.comparing(Employees::getName)).map(x->x.getName()).collect(Collectors.toList());
      System.out.println(nm);

    //print the employee name in sorting order desc
      List<String> nm1=emp.stream().sorted(Comparator.comparing(Employees::getName).reversed()).map(x->x.getName()).collect(Collectors.toList());
      System.out.println(nm1);

      //sum of there age
      double d=emp.stream().mapToInt(c->c.getAge()).sum();
      System.out.println(d);

      //count employee
      Long m=emp.stream().count();
      System.out.println(m);

      //print the name of employee whose name start with k
      List<String> listof=emp.stream().filter(x->x.getName().startsWith("k")).map(x->x.getName()).collect(Collectors.toList());
      System.out.println(listof);

      //length of everye mployee name

      List<Integer> len=emp.stream().map(x->x.getName().length()).collect(Collectors.toList());
      System.out.println(len);

      //avg age of employee
      double age=emp.stream().mapToInt(x->x.getAge()).average().getAsDouble();
      System.out.println(age);



      String sg=emp.stream().max(Comparator.comparing(Employees::getAge)).map(x->x.getName()).get();
      System.out.println(sg);


    //print list of employee
      List<Double> table1=emp.stream().map(x->x.getSalary()).collect(Collectors.toList());
      System.out.println(table1);


      //Emp table

      List<Emp> employeeList = new ArrayList<Emp>();

      employeeList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
      employeeList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
      employeeList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
      employeeList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
      employeeList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
      employeeList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
      employeeList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
      employeeList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
      employeeList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
      employeeList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
      employeeList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
      employeeList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
      employeeList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
      employeeList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
      employeeList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
      employeeList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
      employeeList.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
      Map<String, Long> FM=employeeList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
      System.out.println(FM);
      }
}