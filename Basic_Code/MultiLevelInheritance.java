package Basic;

class First1{
    First1(){

        System.out.println("First1");
    }
}

class Second1 extends First1{
    Second1(){

        System.out.println("Second1");
    }
}

class Third1 extends Second1{
    Third1(){

        System.out.println("Third1");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Third1 t = new Third1();
    }
}