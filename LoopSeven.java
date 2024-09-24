package Loop_Basics;

import java.util.*;
public class LoopSeven {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);
        char a= 'a';

        System.out.print("Enter the character: ");
        char n=user.next().charAt(0);
        while(n>=a){
            System.out.printf(" %c",n);
            n--;
        }

    }
}
