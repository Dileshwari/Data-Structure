package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EmployeeException extends Exception{
    public EmployeeException(String m){

        super(m);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I am finally block");
        }


        ExceptionHandling e= new ExceptionHandling();
        try {
            e.checkEmployeeExists("khushi1");
            e.checkEmployeeExists("khishi");
        } catch (EmployeeException ex) {
            System.out.println("Exception occured: "+e);
        }

    }


    public void checkEmployeeExists(String name) throws EmployeeException {
        List<String> l = new ArrayList<>(Arrays.asList("khishi", "mim", "Raj"));

        if (l.contains(name)) {
            throw new EmployeeException("employee already exist in db");
        } else {
            l.add(name);
            System.out.println("employee added in db");
        }


    }
}
