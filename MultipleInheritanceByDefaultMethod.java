
package Basic;

interface Base1{
    default void base() {
        System.out.println("I am base Interface");
    }
}
interface SecondBase1{
    default void base() {
        System.out.println("I am second base Interface");
    }
}
class Implements1 implements Base1,SecondBase1{
    @Override
    public void base() {
        Base1.super.base();
        SecondBase1.super.base();;
    }
}
public class MultipleInheritanceByDefaultMethod {
    public static void main(String[] args){
        Implements1 i= new Implements1();
        i.base();
    }
}
