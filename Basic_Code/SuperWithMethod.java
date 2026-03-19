
package Basic;

class AA1{
    void AA(){
        System.out.println("AA block");
    }

}
class AC1 extends AA1{
    void AC(){
        super.AA();
        System.out.println("AB block");
    }

}
public class SuperWithMethod {
    public static void main(String[] args){
        AC1 ab= new AC1();
        ab.AC();
    }
}

