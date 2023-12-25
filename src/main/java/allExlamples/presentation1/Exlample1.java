package allExlamples.presentation1;

import java.util.Scanner;
//Taking two numbers from the user and printing the larger one on the screen.
public class Exlample1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.printf("Enter the 1st number:  ");
        int numberOne= scan.nextInt();
        System.out.printf("Enter the 2nd number:  ");
        int numberTwo= scan.nextInt();
        if(numberOne>numberTwo){
            System.out.println("Big Number: "+numberOne);
        }else if (numberOne<numberTwo){
            System.out.println("Big Number:  "+numberTwo);
        }else {
            //We can use this function when two numbers are equal.
            //Since two numbers are equal,we can randomly print one of them.
            System.out.println("Big Number:   "+numberOne);
        }

    }
}
