package com.company;

import java.util.Scanner;

public class Player {
    String name;
    int score;

    Scanner sc= new Scanner(System.in);
    public String getName() {
        name = sc.nextLine();
        while(name == null || name.length()<=0) {
            System.out.println("Enter a name");
            name = sc.nextLine();
        }
        return name; }
}
