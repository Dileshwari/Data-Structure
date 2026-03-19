

public class Mainproject
{
public static void main(String[] args) {
System.out.println("Hello World");

int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
System.out.println("Maximum  sum is "
+ max(a));
}

public static int max(int[] arr){
int A=Integer.MIN_VALUE;
System.out.println(A);
int B=0;
for(int i=0;i<arr.length;i++){


B=B+arr[i];//B= -2->0 -3->0 4->4 3->3-> 1-> 2-->7
if(A<B){//true   true 
A=B;//-2   4   7

}
if(B<0){ //true 
B=0; //0 0

} 
}


return A;
}
}
