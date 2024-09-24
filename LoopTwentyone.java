package Loop_Basics;

import java.util.*;
public class LoopTwentyone {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the ending number: ");
        int n=user.nextInt();
        int a=1;

        while(a<=n){
            if(a%3==0){
                a++;
                continue;
            }
            System.out.printf(" %d",a);

            a++;
        }

    }
}

