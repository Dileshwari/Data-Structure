package Basic;

class A{

    void m(){

        System.out.println("I am single inheritance m");
    }
}
public class SingleInheritance extends A {
    public static void main(String[] args){

        A a= new A();
        a.m();
    }
}
