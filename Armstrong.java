
import java.util.*;
import java.math.*;

public class Armstrong {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();

        int n1=n;
        int sum=0;

        while(n1 >0){

            int temp=n1%10;
            sum+=Math.pow(temp,3);
            n1=n1/10;
        }


        if(sum==n){

            System.out.println("armstrong number");
        }

        else{
            System.out.println("not armstrong number");
        }





        }
    }
    

