package allExlamples.presentation1;

import java.util.Scanner;
/*
Take 1 number from the user and
 print the sum of the numbers from that number to 1 on the screen.
 */
public class Exlample3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int number= scan.nextInt();
        int total=0;
        if(number<=0){
            System.out.println("Please enter a value greater than zero.");
        }else if (number==1){
            System.out.println("Total= "+number);
        }else {
            while (number!=0){
                total+=number;
                number--;
            }
            System.out.println("Total= "+total);
        }

    }
}
