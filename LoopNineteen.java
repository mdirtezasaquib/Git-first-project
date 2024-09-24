package Loop_Basics;

import java.util.*;
public class LoopNineteen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int n=user.nextInt();
        int rev=0;

        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.printf("Reverse no = %d",rev);

    }
}
