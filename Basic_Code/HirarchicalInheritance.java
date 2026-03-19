package Basic;

class First{
    First(){

        System.out.println("First");
    }
}

class Second extends First{
    Second(){

        System.out.println("Second");
    }
}

class Third extends First{
    Third(){

        System.out.println("Third");
    }
}
public class HirarchicalInheritance {
    public static void main(String[] args){
        Third t= new Third();
        Second s =new Second();
    }
}
