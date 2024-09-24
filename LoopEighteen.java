package Loop_Basics;

import java.util.*;
public class LoopEighteen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int n=user.nextInt();
        int count =0;

        while(n>0){
            count++;
            n=n/10;
        }
        System.out.printf("count = %d",count);

    }
}
