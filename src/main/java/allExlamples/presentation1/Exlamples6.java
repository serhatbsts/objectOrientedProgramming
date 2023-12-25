package allExlamples.presentation1;

import java.util.Scanner;
//Take 10 numbers using a for loop and calculate their average.

public class Exlamples6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int total=0;
        for(int i=0;i<10;i++){

            System.out.println("Enter the "+(i+1)+". number");
            int number=scan.nextInt();
            total+=number;
        }
        double average=(total/10.0);
        System.out.println("Average: " +average);

    }
}
