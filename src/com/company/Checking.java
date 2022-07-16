package com.company;

public class Checking {


    public static int CheckLadderandSnakesEasy(int score ) {
        if(score >100)
            return score;
        else if(score == 3){
            score += 48;
            System.out.print("\tGet a ladder (03 to 51)");}
        else if(score == 6){
            score += 21;
            System.out.print("\tGet a ladder (06 to 27)");}
        else if (score == 20){
            score += 50;
            System.out.print("\tGet a ladder (20 to 70)");}
        else if (score == 36){
            score += 19;
            System.out.print("\tGet a ladder (36 to 55)");}
        else if (score == 63){
            score += 32;
            System.out.print("\tGet a ladder (63 to 95)");}
        else if (score == 68){
            score = 98;
            System.out.print("\tGet a ladder (68 to 98)");}
        // snakes
        else if (score == 25){
            score = 5;
            System.out.print("\tGet a snake (25 to 5)");}
        else if (score == 34){
            score = 2;
            System.out.print("\tGet a snake (34 to 02)");}
        else if (score == 47){
            score = 19;
            System.out.print("\tGet a snake (47 to 19)");}
        else if (score == 65){
            score = 52;
            System.out.print("\tGet a snake (65 to 52)");}
        else if (score == 87){
            score = 57;
            System.out.print("\tGet a snake (87 to 57)");}
        else if (score == 91){
            score = 61;
            System.out.print("\tGet a snake (91 to 61)");}
        else if (score == 99){
            score =36;
            System.out.print("\tGet a snake (99 to 36)");}

        return score;
    }


     public static int CheckLadderandSnakesMedium(int score ) {
        if(score >100)
            return score;
        else if(score == 3){
            score = 41;
            System.out.print("\tGet a ladder (03 to 41)");}
        else if(score == 6){
            score = 27;
            System.out.print("\tGet a ladder (06 to 27)");}
        else if (score == 20){
            score = 50;
            System.out.print("\tGet a ladder (20 to 50)");}
        else if (score == 36){
            score = 55;
            System.out.print("\tGet a ladder (36 to 55)");}
        else if (score == 63){
            score = 77;
            System.out.print("\tGet a ladder (63 to 77)");}
        else if (score == 68){
            score = 93;
            System.out.print("\tGet a ladder (68 to 93)");}
        // snakes
        else if (score == 25){
            score = 5;
            System.out.print("\tGet a snake (25 to 5)");}
        else if (score == 34){
            score = 2;
            System.out.print("\tGet a snake (34 to 02)");}
        else if (score == 47){
            score = 19;
            System.out.print("\tGet a snake (47 to 19)");}
            else if (score == 52){
            score = 25;
            System.out.print("\tGet a snake (52 to 25)");}
        else if (score == 65){
            score = 52;
            System.out.print("\tGet a snake (65 to 52)");}
        else if (score == 87){
            score = 57;
            System.out.print("\tGet a snake (87 to 57)");}
        else if (score == 95){
            score = 61;
            System.out.print("\tGet a snake (95 to 61)");}
        else if (score == 99){
            score =36;
            System.out.print("\tGet a snake (99 to 36)");}

         return score;
     }


    public static int CheckLadderandSnakesHard(int score ) {
        if(score >100)
            return score;
        else if(score == 3){
            score = 41;
            System.out.print("\tGet a ladder (03 to 41)");}
        else if(score == 6){
            score = 27;
            System.out.print("\tGet a ladder (06 to 27)");}
        else if (score == 20){
            score = 50;
            System.out.print("\tGet a ladder (20 to 50)");}
        else if (score == 36){
            score = 55;
            System.out.print("\tGet a ladder (36 to 55)");}
        else if (score == 63){
            score = 77;
            System.out.print("\tGet a ladder (63 to 77)");}
        else if (score == 68){
            score = 89;
            System.out.print("\tGet a ladder (68 to 89)");}
        // snakes
        else if (score == 25){
            score = 5;
            System.out.print("\tGet a snake (25 to 5)");}
        else if (score == 34){
            score = 2;
            System.out.print("\tGet a snake (34 to 02)");}
        else if (score == 47){
            score = 19;
            System.out.print("\tGet a snake (47 to 19)");}
        else if (score == 52){
            score = 25;
            System.out.print("\tGet a snake (52 to 25)");}
        else if (score == 65){
            score = 52;
            System.out.print("\tGet a snake (65 to 52)");}
        else if (score == 87){
            score = 57;
            System.out.print("\tGet a snake (87 to 57)");}
        else if (score == 91){
            score = 61;
            System.out.print("\tGet a snake (95 to 61)");}
        else if (score == 95){
            score =40;
            System.out.print("\tGet a snake (95 to 40)");}
        else if (score == 99){
            score =36;
            System.out.print("\tGet a snake (99 to 36)");}

        return score;
    }


}
