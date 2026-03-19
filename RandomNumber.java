package Basic;

import java.util.Random;
public class RandomNumber {

    public static void main(String[] args){
        Random r= new Random();
        int n= r.nextInt(100);
        System.out.println(r.nextInt(300));


    }
}
