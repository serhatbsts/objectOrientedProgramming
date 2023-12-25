package allExlamples.presentation1;

import java.util.Scanner;
//Establish a small-scale tourism agency application.

public class Exlamples4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Which tour group would you like to join:");
        System.out.println("1 for North America");
        System.out.println("2 for Europe");
        System.out.println("3 for Asia");

        int selection=scan.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You chose the North America tour.");
                break;
            case 2:
                System.out.println("You chose the Europe tour.");
                break;
            case 3:
                System.out.println("You chose the Asia tour.");
                break;
            default:
                System.out.println("Please enter a correct value.");
                break;
        }
        System.out.println("Do you want to buy.");
        System.out.println("1 for yes.");
        System.out.println("2 for no.");
        int purchaseStatus=scan.nextInt();

        if (purchaseStatus==1){
            System.out.println("Payment has been received.");
        }else if (purchaseStatus==2){
            System.out.println("Logging out of the system.");
        }else {
            System.out.println("Please enter a correct value.");
        }

    }
}
