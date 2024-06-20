import java.util.*;

class Fibonaci{
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter 1st number");
      int a=sc.nextInt();

      System.out.println("enter 2st number");
      int b=sc.nextInt();

      System.out.println("enter count of numbers to br peinted");
      int count=sc.nextInt();

      int c=0;
      
      System.out.println(a);
      System.out.println(b);
      for(;count >0;count--){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;

      }


    }
}