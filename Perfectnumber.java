import java.util.*;

public class Perfectnumber {
    
    public static void main(String[] args){

        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sum=1;
        for(int i=2; i<= n/2 ;i++){

            if(n%i==0){
                sum+=i;
            }

            if(sum >n){
                break;
            }
        }

        if(sum==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
