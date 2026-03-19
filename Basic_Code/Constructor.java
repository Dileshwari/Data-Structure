package Basic;

public class Constructor {
    int a;
    int b;
    Constructor(){
        System.out.println("default constructor");
    }

    Constructor(int a, int b){

        this.a=a;
        this.b=b;
        System.out.println(a +" : "+b);
    }
    public static void main(String[] args){
        Constructor c=new Constructor();
        Constructor c1= new Constructor(40, 20);
    }
}
