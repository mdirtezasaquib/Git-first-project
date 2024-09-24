package Loop_Basics;

import java.util.Scanner;

public class Q1 {
    public static class Loop27 {

        public static void main(String[] args) {

            Scanner user = new Scanner(System.in);


            System.out.print("Enter the number: ");
            int n = user.nextInt();


            int sum=0;
            for(int m=n;m>0;m=m/10){
                int ld=m%10;
                int fact=1;

                for(int i=1;i<=ld;i++){
                  fact = fact *i;
                }
                sum=sum+fact;
            }
            if(sum==n){
                System.out.print("This is strong number: ");
            }
            else{
                System.out.print("This is not strong number: ");
            }



        }
    }
}
