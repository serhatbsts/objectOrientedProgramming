package allExlamples.presentation1;

import java.util.Scanner;
/*
Write the application that produces the output in the example
*
**
***
****
*****
******
*/
public class Exlamples7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of rows.");
        int order=scan.nextInt();
        int star=1;

        for(int i=0;i<order;i++){
            for(int j=0;j<star;j++){

                System.out.print("*");
            }
            System.out.println();
            star++;
        }

    }
}
