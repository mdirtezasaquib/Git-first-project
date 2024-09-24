package Loop_Basics;

import java.util.*;
public class LoopNine {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);
        int a=1;
        int fact=1;

        System.out.print("Enter the number: ");
        int n=user.nextInt();
        while(a<=n){
            fact=fact*a;

            a++;
        }
        System.out.printf("sum of all no =  %d",fact);

    }
}
