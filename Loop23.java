package Loop_Basics;

import java.util.*;
public class Loop23 {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.print("Enter the  number: ");
        int n = user.nextInt();

        int f1=0;
        if(f1==0){
            System.out.printf("%d ",f1);
        }
        int f2=1;
        if(f2==1){
            System.out.printf("%d ",f2);
        }
        int f3=f1+f2;

        while(n>=f3){
            System.out.printf("%d ",f3);
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
    }
}
