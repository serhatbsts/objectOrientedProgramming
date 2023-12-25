package allExlamples.presentation2;

import java.util.Scanner;
/*
Find the exact divisors of a number received from
 the user and calculate the average and sum of these divisors
 */
public class Exlamples4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int userValue= scan.nextInt();
        int sumOfDivisors=0;
        int numberOfDivisors=0;
        for (int i=1;i<=userValue;i++){
            if(userValue%i==0){
                sumOfDivisors+=i;
                numberOfDivisors++;

                System.out.println( i);

            }
        }
        System.out.println( "sum of all divisors: "+sumOfDivisors);
        double ort=(double) sumOfDivisors/numberOfDivisors;
        System.out.println("average of perfect divisors: "+ort);

    }
}
