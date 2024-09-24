package Loop_Basics;

import java.util.*;
public class LoopThirteen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the Loop_Basics.First number: ");
        int a=user.nextInt();

        System.out.print("Enter the second number: ");
        int b=user.nextInt();

        int sum=0;
        int count=0;
        int avg;

        while(a<=b){
            sum=sum+a;
            count++;
            a++;
        }
        avg=sum/count;
        System.out.printf(" Average = %d",avg);

    }
}

