package Basic;

class EmployeeDetails{

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args){
         EmployeeDetails e= new EmployeeDetails();
         e.setAge(30);
         e.setName("Khushi");
      System.out.println(e.getAge());
      System.out.println(e.getName());
    }
}
