
/* ATM machine Project by Atharv Ital*/
/*#CodSoft*/

//package
import java.util.*;
import java.io.*;

//main class

public class ATM extends UserBankAccounnt {

    void withdraw(double amount) {
        Scanner sc1 = new Scanner(System.in);
        int i, j;
        System.out.println("Enetr your pin no...\nRespective I and*enter J block");
        i = sc1.nextInt();
        j = sc1.nextInt();
        if ((i >= 0) && (i < 6) && (j >= 0) && (j < 6)) {
            if (amount < balence[i][j]) {
                balence[i][j] = balence[i][j] - amount;
                System.out.println("Your a/c noxxxxxxxxxx is Debited for Rs." + amount
                        + "\nAvailable balance in your account is Rs." + balence[i][j]);
                System.out.println(
                        "Your transaction has been processed by ANI bank!!!!\n Thank you for choosing ANI Bank");
            } else {
                System.out.println("Your bank account dose not have Sufficient balence to Withdraw.......");
            }
        } else {
            System.out.println("Please enter Valid Pin no ");
            System.out.println("Your transaction has been processed by ANI bank!!!!\n Thank you for choosing ANI Bank");
        }
    }

    void deposit(double amount) {
        Scanner sc2 = new Scanner(System.in);
        int i, j;
        System.out.println("Enetr your pin no...\nRespective I and*enter J block");
        i = sc2.nextInt();
        j = sc2.nextInt();
        if ((i >= 0) && (i < 6) && (j >= 0) && (j < 6)) {
            balence[i][j] = balence[i][j] + amount;
            System.out.println("Your a/c noxxxxxxxxxx is Credited in account  for Rs." + amount
                    + "\nAvailable balance in your account is Rs." + balence[i][j]);
            System.out.println("Your transaction has been processed by ANI bank!!!!\n Thank you for choosing ANI Bank");
        } else {
            System.out.println("Please enter Valid Pin no ");
            System.out.println("Your transaction has been processed by ANI bank!!!!\n Thank you for choosing ANI Bank");
        }
    }

    void chackBalance() {
        Scanner sc3 = new Scanner(System.in);
        int i, j;
        System.out.println("Enetr your pin no...\nRespective I and*enter J block");
        i = sc3.nextInt();
        j = sc3.nextInt();
        if ((i >= 0) && (i < 6) && (j >= 0) && (j < 6)) {
            System.out.println("Available balance in your account is Rs." + balence[i][j]);
            System.out.println("Thank you for choosing ANI Bank");
        } else {
            System.out.println("Please enter Valid Pin no ");
            System.out.println("Thank you for choosing ANI Bank");
        }
    }

    // main method

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Plesae Entered 4 digit ANI Bank Code\nNote:-\n *Provided by ANI bank \n  ***Those users can use ATM who have an account with ANI bank only");
        int a = sc.nextInt();
        if (1 == a % 10) {

            // some instruction

            System.out.println("Welcome to ANI ATM Bank");
            System.out.println("Your request has been Proceed");
            System.out.println("Enter your Name \n *from linked bank account");
            String nm = sc.next();
            boolean value = true;
            int sta;
            System.out.println("Welcome again\nEnter your Choice");
            ATM atm = new ATM();
            double amount;
            while (value) {
                System.out.println("1.Check Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Cancle *all");
                sta = sc.nextInt();

                switch (sta) {
                    case 1:
                        atm.chackBalance();
                        break;
                    case 2:
                        System.out.println("How much do you withdraw from your bank account?\n *enter amount");
                        amount = sc.nextDouble();
                        atm.withdraw(amount);
                        break;
                    case 3:
                        System.out.println("How much do you Deposit in your bank account?\n *enter amount");
                        amount = sc.nextDouble();
                        atm.deposit(amount);
                        break;
                    case 4:
                        System.out.println("Thank you for choosing ANI Bank");
                        value = false;
                        break;
                }
                System.out.println("1.Do you want to go Back........? \n2.Exit!");
                int no = sc.nextInt();
                switch (no) {
                    case 1:
                        value = true;
                        break;
                    case 2:
                        System.out.println("Thank you for choosing ANI Bank");
                        value = false;
                        break;
                }
            }
        } else {
            System.out.println("Your account does not match ANI bank records");
        }
        System.gc();
    }
}

// calss of record of user Banks (Details)

class UserBankAccounnt {
    double balence[][] = { { 654655, 545465, 5146544, 151451, 45625, 78596 },
            { 5465658, 6546584, 451646, 5321653, 541645, 4655454 },
            { 5465456, 456988, 58985, 854996, 8546263, 659465 },
            { 455454, 28596, 52698, 78596, 84596, 85469 },
            { 745896, 859652, 85962, 85965, 56924, 74582 },
            { 545456, 85699, 85469, 85469, 85469, 854562 } };

}
