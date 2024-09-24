package Loop_Basics;

import java.util.*;
public class Loop24 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the Loop_Basics.First number: ");
        int a = user.nextInt();

        System.out.print("Enter the Second number: ");
        int b = user.nextInt();

        int gcf=0;
        int c=1;
        while(c<=b){
            if(a%c==0 && b%c==0){
                gcf=c;
            }
            c++;
        }
        System.out.printf(" Greatest common Factor = %d",gcf);

    }
}

