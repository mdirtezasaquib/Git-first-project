package Loop_Basics;

import java.util.*;
public class LoopSeventeen {

    public static void main(String[] args){

        Scanner user=new Scanner(System.in);


        System.out.print("Enter the Table number: ");
        int table=user.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.printf(" %d * %d = %d\n",table,i,table*i);
        }
    }
}



