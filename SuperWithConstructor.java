package Basic;

class AA{
    AA(){
        System.out.println("AA block");
    }

}
class AC extends AA{
    AC(){
        super();
        System.out.println("AB block");
    }

}
public class SuperWithConstructor {
    public static void main(String[] args){
   AC ab= new AC();

    }
}
