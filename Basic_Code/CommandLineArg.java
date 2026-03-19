package Basic;

public class CommandLineArg {
    public static void main(String[] args){

        if(args.length>0){

            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args.length);
        }
    }
}
