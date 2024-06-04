
/*Rock, Paper, Scissors game by Atharv Ital*/
/*#technohacks*/

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "          ***Welocme to Rock, Paper, Scissors game*** \n*Note:- you play at least 10 times to Analysis");
        // System.out.println("Enter your choice");
        // System.out.println("1.Rock\n2.Paper\n3.Scissor");

        // int a=sc.nextInt();
        int a = 1;
        String nm = "rock";
        String cm = "rock";
        int i = 0;
        int guess = 0;
        int won = 0, draw = 0, lost = 0;
        int j = 1;

        while (j == 1) {

            while (i < 10) {

                System.out.println("\nEnter your choice");
                System.out.println("1.Rock\n2.Paper\n3.Scissor");
                a = sc.nextInt();

                switch (a) {
                    case 1:
                        nm = "rock";
                        break;
                    case 2:
                        nm = "paper";
                        break;
                    case 3:
                        nm = "scissor";
                        break;
                    default:
                        System.out.println("*Please Enter valid Choice");
                        continue;

                }
                guess = (int) (Math.random() * 10);
                switch (guess) {
                    case 1:
                        cm = "rock";
                        break;
                    case 2:
                        cm = "paper";
                        break;
                    case 3:
                        cm = "scissor";
                        break;
                    case 4:
                        cm = "rock";
                        break;
                    case 5:
                        cm = "paper";
                        break;
                    case 6:
                        cm = "scissor";
                        break;
                    case 7:
                        cm = "rock";
                        break;
                    case 8:
                        cm = "paper";
                        break;
                    case 9:
                        cm = "scissor";
                        break;

                    default:
                        cm = "rock";
                        break;
                }

                if ((nm.equals(cm))) {
                    System.out.println("*Draw*");
                    System.out.println("you guess " + nm + " computer guess " + cm);
                    draw++;
                } else if ((cm.equals("rock")) && (nm.equals("paper"))) {
                    System.out.println("Congratulation!!!!!!!\n*You Won*");
                    System.out.println("you guess " + nm + " computer guess " + cm);
                    won++;
                } else if ((cm.equals("paper")) && (nm.equals("scissor"))) {
                    System.out.println("Congratulation!!!!!!!\n*You Won*");
                    System.out.println("you guess " + nm + " computer guess " + cm);
                    won++;
                } else if ((cm.equals("scissor")) && (nm.equals("rock"))) {
                    System.out.println("Congratulation!!!!!!!\n*You Won*");
                    System.out.println("you guess " + nm + " computer guess " + cm);
                    won++;
                } else {
                    System.out.println("*You Lost*");
                    System.out.println("you guess " + nm + " computer guess " + cm);
                    lost++;
                }

                i++;
            }

            System.out.println("\nYour Analysis is \nYou game is won " + won + " times\nYou game is Draw " + draw
                    + " times\nYou game is Lost " + lost + " times");

            System.out.println("\nYou want to play again?\nEnter Your choice...");
            System.out.println("1.Play Again\n2.Exit");
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    j = 1;
                    i = 0;
                    break;
                case 2:
                    j++;
                    break;
                default:
                    j++;

            }
        }

        if (j == 2) {
            System.out.println("Thank you for playing");
        }

    }
}