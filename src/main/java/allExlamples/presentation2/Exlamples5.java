package allExlamples.presentation2;

import java.util.Scanner;
/*
Create a calculator where the user can perform as many operations as he wants,
using the while structure.
When the user enters the value 0, he/she will exit the application.
When the user enters a negative value, it asks the user if he is sure.
*/
public class Exlamples5 {
    static boolean a = true;
    static int number;
    static int b;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (a) {
            System.out.println("Please select the action you want to perform.");
            System.out.println("1 for collection.");
            System.out.println("2 for subtraction.");
            System.out.println("3 for multiplication.");
            System.out.println("4 for division.");
            System.out.println("0 for exit.");
            int process = scan.nextInt();
            switch (process) {
                case 1:
                    System.out.println(addition());

                    break;
                case 2:
                    System.out.println(subtraction());
                    break;
                case 3:
                    System.out.println(multiplication());
                    break;
                case 4:
                    System.out.println(division());
                    break;
                case 0:
                    exit();
                    a=false;
                    break;
                default:
                    error();
                    break;
            }


        }
    }



    public static int addition() {

        System.out.println("You can start collecting.");
        System.out.println("0 for exit.");
        int total = 0;
        while (a) {
            number=scan.nextInt();
            if(number==0){
                a=false;
            }else {
                if (number < 0) {
                    System.out.println("The number you entered is negative. Do you want to continue?");
                    System.out.println("Press 1 if you want to continue, press 2 to change the number.");
                    b = scan.nextInt();
                    switch (b) {
                        case 1:
                            total +=number;
                            break;
                        case 2:
                            System.out.println("Enter the number again.");
                            number = scan.nextInt();
                            break;
                        default:
                            error();
                            break;

                    }
                }else {
                    total+=number;
                }

            }
        }


        return total;
    }
    public static int subtraction(){
        System.out.println("You can start subtraction.");
        System.out.println("0 for exit.");
        int calculation = 0;
        while (a) {
            number=scan.nextInt();
            if(number==0){
                a=false;
            }else {
                if (number < 0) {
                    System.out.println("The number you entered is negative. Do you want to continue?");
                    System.out.println("Press 1 if you want to continue, press 2 to change the number.");
                    b = scan.nextInt();
                    switch (b) {
                        case 1:
                            calculation =number-calculation;
                            break;
                        case 2:
                            System.out.println("Enter the number again.");
                            number = scan.nextInt();
                            break;
                        default:
                            error();
                            break;

                    }
                }else {
                    calculation =number-calculation;
                }

            }
        }



        return calculation;

    }

    public static int multiplication(){

        System.out.println("You can start subtraction.");
        System.out.println("0 for exit.");
        int calculation = 1;
        while (a) {
            number=scan.nextInt();
            if(number==0){
                a=false;
            }else {
                if (number < 0) {
                    System.out.println("The number you entered is negative. Do you want to continue?");
                    System.out.println("Press 1 if you want to continue, press 2 to change the number.");
                    b = scan.nextInt();
                    switch (b) {
                        case 1:
                            calculation *=number;
                            break;
                        case 2:
                            System.out.println("Enter the number again.");
                            number = scan.nextInt();
                            break;
                        default:
                            error();
                            break;

                    }
                }else {
                    calculation*=number;
                }

            }
        }



        return calculation;
    }
    public static double division(){

        System.out.println("You can start division.");
        System.out.println("0 for exit.");
        double calculation = 1.0;
        while (a) {
            number=scan.nextInt();
            if(number==0){
                a=false;
            }else {
                if (number < 0) {
                    System.out.println("The number you entered is negative. Do you want to continue?");
                    System.out.println("Press 1 if you want to continue, press 2 to change the number.");
                    b = scan.nextInt();
                    switch (b) {
                        case 1:
                            calculation =number/calculation;
                            break;
                        case 2:
                            System.out.println("Enter the number again.");
                            number = scan.nextInt();
                            break;
                        default:
                            error();
                            break;

                    }
                }else {
                    calculation=number/calculation;
                }

            }
        }



        return calculation;
    }

    public static void   error(){
        System.out.println("You made an incorrect entry, try again.");
    }
    public static void exit(){
        System.out.println("Exiting...");
    }
}

