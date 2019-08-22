package main;

import java.util.Scanner;

/**
 * @author sparsh gupta
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine().trim();
        System.out.println("Welcome, " + userName + "!");
        input.close();
    }
}
