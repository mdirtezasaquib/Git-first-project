package Loop_Basics;

import java.util.*;
public class LoopSix {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);
        char a= 'a';

        System.out.print("Enter the character: ");
         char n=user.next().charAt(0);
        while(a<=n){
            System.out.printf(" %c",a);
            a++;
        }

    }
}

