package Loop_Basics;

import java.util.*;
public class LoopSixteen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the base number: ");
        int base=user.nextInt();

        System.out.print("Enter the power number: ");
        int power=user.nextInt();

        int temp =base;

        while(power>1){

            base=base*temp;

            power--;
        }

        System.out.printf(" Answer =  %d",base);

    }
}


