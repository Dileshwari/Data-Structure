package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import java8.Employees;
public class PackageImport {

    public static void main(String[] args){

        List<Employees> emp = Arrays.asList(new Employees("khushi", 2, 10000), new Employees("deshmukh", 23, 200),
                new Employees("mimi", 45, 30000000), new Employees("tribhuvan", 57, 20000),
                new Employees("ekta", 20, 10000));

        List<Employees> emplist= new ArrayList<>(emp);
        System.out.println("empList: "+emplist);

        List<String> empName= emp.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println("empName: "+empName);

    }
}
