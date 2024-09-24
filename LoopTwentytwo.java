package Loop_Basics;

import java.util.*;
public class LoopTwentytwo {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int n=user.nextInt();
        int rev=0;

        int a=n;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }

        if(a==rev) {
            System.out.printf(" %d is pallindrome",a);
        }
        else{
            System.out.printf(" %d is not pallindrome",a);
        }

    }
}
