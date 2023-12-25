package allExlamples.presentation1;

import java.util.Scanner;
//Calculate the student's CGPA by using the student's course grades and course credits.

public class Exlamples8 {
    public static void main(String[] args) {
        System.out.println("Welcome to the grade calculation system.");
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        double point;
        int courseCredit;
        double calculation=0.0;
        int b=1;
        int totalCredit=0;
        double average=0.0;
        int numberOfLessons=0;
        do {
            System.out.println("Press the 'h' key to start the calculation.");
            System.out.println("You can press any key to continue");
            String input = scan.next();
            switch (input) {
                case "h":
                    System.out.println("Calculations are being made.");
                    average=calculation/(double) totalCredit;
                    System.out.println("Average of "+numberOfLessons+" lessons: "+average);
                    cgpaCalculation(average);


                    a = false;
                    break;

                default:
                    System.out.println("Enter a grade between 4.0 and 0.0");
                    System.out.println("Enter the score of the "+b+". lesson.");
                    point=scan.nextDouble();
                    System.out.println("Enter the credits of the "+b+". lesson.");
                    courseCredit=scan.nextInt();

                    totalCredit+=courseCredit;

                    calculation+=(point*(double)courseCredit);
                    b++;
                    numberOfLessons++;

                    break;


            }
        } while (a);


    }
    public static void cgpaCalculation(double average){

        if(4.0>=average&&average>3.5){
            System.out.println("Your average is AA");
            System.out.println("You earned the high honor certificate.");
        }else if (3.5>=average&&average>3.0){
            System.out.println("Your average is BA");
            System.out.println("You earned the certificate of honor");

        }else if (3.0>=average&&average>2.5){
            System.out.println("Your average is BB");

        }else if (2.5>=average&&average>2.0){
            System.out.println("Your average is CB");

        }else if (2.0>=average&&average>1.5){
            System.out.println("Your average is CC");

        }else if (1.5>=average&&average>1.0){
            System.out.println("Your average is DC");

        }else if (1.0>=average&&average>0.5){
            System.out.println("Your average is DD");

        }else if (0.5>=average&&average>0.0){
            System.out.println("Your average is FD");

        }else if (average==0.0){
            System.out.println("Your average is FF");

        }


    }


}
