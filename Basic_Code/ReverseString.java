package Basic;

public class ReverseString {
    public static void main(String[] args){
        String d="Dileshwari";
        String rev= "";
        for(int i=d.length()-1;i>=0;i--){

            char ch=d.charAt(i);

            rev=rev.concat(Character.toString(ch));

        }
        System.out.println(rev);
    }
}
