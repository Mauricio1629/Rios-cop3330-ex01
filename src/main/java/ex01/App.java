/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex01;

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    public String readName() {
        System.out.print("Whats is your name? ");
        return input.nextLine();
    }

    public String generateOutputString(String name) {
        return "Hello, "+name+", nice to meet you!";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}
