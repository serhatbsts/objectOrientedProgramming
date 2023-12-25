package allExlamples.presentation1;

import java.util.Scanner;
/*
Prompt the user to enter values until the user enters -1.
 When the user enters the value -1,
 find the average of all the values entered until then.
 */
public class Exlample2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int total=0;
        int counter=0;
        int number=0;
        do{
            System.out.println("Enter value:  ");
            number=scan.nextInt();
            if(number!=-1){
                counter++;
                total+=number;
            }
        }while (number!=-1);
        double average=(double) total/counter;

        System.out.println("Average of numbers:  " +average);
    }
}
