package Loop_Basics;

import java.util.*;
public class LoopThird {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);
        int a=1;

        System.out.print("Enter the number: ");
        int n=user.nextInt();
        while(n>=a){
            System.out.printf(" %d",n);
            n--;
        }

    }
}