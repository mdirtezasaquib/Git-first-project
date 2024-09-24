package Loop_Basics;

import java.util.*;
public class LoopEleven {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the Loop_Basics.First number: ");
        int a=user.nextInt();

        System.out.print("Enter the second number: ");
        int b=user.nextInt();

        while(a<=b){
            if(a%2!=0){
                System.out.printf(" %d",a);
            }
            a++;
        }

    }
}
