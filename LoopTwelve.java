package Loop_Basics;

import java.util.*;
public class LoopTwelve {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the Loop_Basics.First number: ");
        int a=user.nextInt();

        System.out.print("Enter the second number: ");
        int b=user.nextInt();

        int count=0;

        while(a<b){
            count++;
            a++;
        }
        System.out.printf(" count = %d",count);

    }
}

