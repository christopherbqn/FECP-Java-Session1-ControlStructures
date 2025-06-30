package org.example;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium):");
        String membershipStatus = scanner.nextLine();
        membershipStatus = membershipStatus.toLowerCase();

        // check if membership status is valid
        if (!membershipStatus.equals("regular") && !membershipStatus.equals("vip") && !membershipStatus.equals("premium")) {
            System.out.println("Invalid membership status entered.");
        } else {
            System.out.print("Enter age: ");
            int memberAge = scanner.nextInt();

            // calling the calculator method
            calculatePrice(membershipStatus, memberAge);
        }
    }

    // calculate membership price
        public static void calculatePrice(String membershipStatus, int memberAge){
            float price;
            switch(membershipStatus){
                case("regular"):
                    if(memberAge<18){
                        price = 50;
                    } else if(memberAge<=64) {
                        price = 100;
                    } else {
                        price = 75;
                    }
                    break;
                case("vip"):
                    if(memberAge<18){
                        price = 75;
                    } else if(memberAge<=64) {
                        price = 150;
                    } else {
                        price = 112.50f;
                    }
                    break;
                case("premium"):
                    if(memberAge<18){
                        price = 100;
                    } else if(memberAge<=64) {
                        price = 200;
                    } else {
                        price = 150;
                    }
                    break;
                default:
                    return;
            }
            //printing results
            System.out.printf("Price: $%.2f", price);
        }
}