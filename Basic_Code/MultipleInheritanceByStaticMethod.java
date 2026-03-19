package Basic;

interface Base2{
    static void base() {
        System.out.println("I am base Interface");
    }
}
interface SecondBase2{
    static void base() {
        System.out.println("I am second base Interface");
    }
}


class Implements2 implements Base2,SecondBase2{
    public void base() {
        Base2.base();
        SecondBase2.base();;
    }
}
public class MultipleInheritanceByStaticMethod {
    public static void main(String[] args){
        Implements2 i= new Implements2();
        i.base();
    }
}
