
/* NUMBER GAME by Atharv Ital*/
/*#CodSoft*/

//package
import java.io.*;
import java.util.*;
import java.lang.Math;

//main class 

public class Number {

    // main method

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // some instruction

        System.out.println("      ***-:Welcome to Number Guessing Game:-***");
        System.out.println("NOTE:-\n *Guess the number between 1 to 100\n");
        System.out.println("You need any clue for this game?");
        System.out.println("1.I need clue\n2.I don't want a clue");
        System.out.println("Enter your choice...");
        int s = sc.nextInt();
        boolean value = true;
        switch (s) {
            case 1:
                value = true;
                break;
            case 2:
                value = false;
                break;
        }

        int a = 1, b = 100;

        // random() method in Math class
        int guess = (int) (Math.random() * 100);
        int n = 0;
        // System.out.println(""+guess);

        int i = 0;
        while (i < 10) {

            System.out.println("\nThis is your " + (i + 1) + " Trial");
            System.out.println("Enter any number to guess...........");
            n = sc.nextInt();

            if (value) {
                if (guess < n) {
                    System.out.println("your guess is too high");
                } else if (guess > n) {
                    System.out.println("your guess is too low");
                } else if (guess == n) {
                    System.out.println("Congratulation!!!!!");
                    System.out.println("Your guess is absolutely correct");
                    System.out.println("Your Score is #" + (100 - ((i) * 10)));
                    break;
                }
            } else {

                if (guess == n) {
                    System.out.println("Congratulation!!!!!");
                    System.out.println("Your guess is absolutely correct");
                    System.out.println("Your Score is #" + (100 - ((i) * 10)));
                    break;
                }
            }

            i++;
        }

        // if you not guess

        if (guess != n) {
            System.out.println("your not guess the number  ");
            System.out.println("Our number is " + guess);
            System.out.println("Your Score is 0");
        }
    }

}
