package allExlamples.presentation1;

import java.util.Scanner;
//Print the number received from the user to the screen up to one.

public class Exlamples5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number.  ");
        int number=scan.nextInt();

        for (int i=number, j=1;i>0;i--,j++){

            if (i!=1){
                System.out.print(j+" , ");


            }else {
                System.out.println(j);
            }

        }

    }
}
