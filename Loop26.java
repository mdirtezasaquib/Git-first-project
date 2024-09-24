package Loop_Basics;

import java.util.*;
public class Loop26 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int n = user.nextInt();

        int count=0;

        for(int a=n;a>0;a=a/10){
            count++;
        }
        int sum=0;
        for(int m=n;m>0;m=m/10){
            int ld=m%10;
            int base=ld;

            for(int power=count;power>1;power-- ){
                base=base*ld;
            }
            sum=sum+base;
        }
        if(sum==n){
            System.out.print("This is armstrong number: ");
        }
        else{
            System.out.print("This is not armstrong number: ");
        }



    }
}



