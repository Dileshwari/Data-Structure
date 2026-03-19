
package Basic;

class AA2{
    int a=10;
    void AA(){
        System.out.println("AA block");
    }

}
class AC2 extends AA2{
    void AC(){
        super.AA();
        System.out.println(super.a);
        System.out.println("AB block");
    }

}
public class SuperWithVariable {
    public static void main(String[] args){
        AC2 ab= new AC2();
        ab.AC();
    }
}

