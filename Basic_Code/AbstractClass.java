package Basic;
abstract class Ab{

    void m(){

        System.out.println("m1 method");
    }

}
public class AbstractClass extends Ab {
    void m(){

        System.out.println("m2 method");
    }
    public static void main(String[] args){
        AbstractClass a= new AbstractClass();
        a.m();

    }
}
