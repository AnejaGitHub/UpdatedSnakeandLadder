package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Welcome To Snake And Ladder Game");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     It is Two Players Game");
        Scanner sc = new Scanner(System.in);



        boolean quit = false;
        Printing.printActions();
        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = sc.nextInt();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    Starting(1);
                    break;

                case 2:
                    Starting(2);
                    break;

                case 3:
                    Starting(3);
                    break;

                case 4:
                    Printing.SnakesandLadders();
                    break;

                case 5:
                    rules();
                    break;

                case 6:
                Printing.printActions();
                    break;
            }

        }


    }



    public static void Starting(int lavel) {
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("Enter first Player name: ");
        player1.getName();
        System.out.println("Enter second Player name: ");
        player2.getName();

        player1.score = 0;
        player2.score = 0;



        while(true) {
            System.out.println("Press 9 " + player1.name + ", for next move");
            int ch = sc.nextInt();
            if (ch == 9) {

                int nextnum = (int) (Math.random() * 6 + 1);

                System.out.print(player1.name + " get " + nextnum + "\t" );
                int temp = player1.score + nextnum;
                if (temp <= 100)
                    player1.score += nextnum;
                if (lavel == 1)
                    player1.score = Checking.CheckLadderandSnakesEasy(player1.score);
                else if (lavel == 2)
                    player1.score = Checking.CheckLadderandSnakesMedium(player1.score);
                else if (lavel == 3)
                    player1.score = Checking.CheckLadderandSnakesHard(player1.score);
                System.out.println("\t" + player1.name + "'s score :" + player1.score);
            }

            System.out.println("Press 8 " + player2.name + ", for next move");
            int ch1 = sc.nextInt();
            if (ch1 == 8) {

                int nextnum2 = (int) (Math.random() * 6 + 1);
                System.out.print(player2.name + " get " + nextnum2 + "\t");
                int temp = player2.score + nextnum2;
                if(temp <= 100)
                    player2.score += nextnum2;
                if (lavel == 1)
                    player2.score = Checking.CheckLadderandSnakesEasy(player2.score);
                else if (lavel == 2)
                    player2.score = Checking.CheckLadderandSnakesMedium(player2.score);
                else if (lavel == 3)
                    player2.score = Checking.CheckLadderandSnakesHard(player2.score);
                System.out.println("\t" + player2.name + "'s score :" + player2.score);
            }
            if( ch ==0 || ch1 == 0)
                break;

            if (player1.score == 100 || player2.score == 100) {
                if (player1.score == 100 && player2.score == 100)
                    System.out.println("Match is Tie");
                else if (player1.score == 100)
                    System.out.println("Balle Balle " + player1.name + " has won       @# Celebrating #@");
                else if(player2.score == 100)
                    System.out.println("Balle Balle " + player2.name + " has won       @# Celebrating #@");
                break;}
        }

    }

    private static void rules() {
        System.out.println(
                "1. Player name should not be blank\n" +
                        "2. For rolling dice player should press right button\n\tPlayer 1 press '9' and Player 2 press '8' \n\totherwise you miss your 1 dice roll\n"  +
                        "3. There are some Ladder and Snake presents in the way to reach victory('score = 100') \n" +
                        "4. For rolling the dice doesn't press any character\n" +
                        "\t\t\t\t\t\t\t Thank You \n\t\t\t\t\t\t\tBest Wishes"
        );
    }

}



