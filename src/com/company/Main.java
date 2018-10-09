package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbreader = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = kbreader.nextLine();

        System.out.println("Please enter your age.");
        int age = kbreader.nextInt();

        Random rand1 = new Random(age);

        System.out.println("Nice to meet you " + name + "! Your lucky number is " + rand1.Number());
    }
}
