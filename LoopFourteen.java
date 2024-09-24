package Loop_Basics;

import java.util.*;
public class LoopFourteen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the Loop_Basics.First number: ");
        int a=user.nextInt();

        System.out.print("Enter the second number: ");
        int b=user.nextInt();

        int sum=0;

        while(a<=b){
            if(a%2==0) {
                sum = sum + a;
            }
            a++;
        }

        System.out.printf(" sum of even number =  %d",sum);

    }
}
