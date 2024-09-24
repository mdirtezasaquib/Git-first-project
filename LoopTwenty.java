package Loop_Basics;

import java.util.*;
public class LoopTwenty {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int n=user.nextInt();
        int a=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=1;
                break;
            }
        }
        if(a==0){
            System.out.printf("%d  is prime no:",n);
        }
        else{
            System.out.printf("%d  is not prime no:",n);
        }

    }
}

