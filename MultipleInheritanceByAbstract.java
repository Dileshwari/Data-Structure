package Basic;

interface Base{
    abstract void base();
}
interface SecondBase{
    abstract void base();
}
class Implements implements Base,SecondBase{


    @Override
    public void base() {
        System.out.println("I am base Interface");
    }

}
public class MultipleInheritanceByAbstract {
    public static void main(String[] args){
        Implements i= new Implements();
        i.base();
    }
}
