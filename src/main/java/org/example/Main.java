package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = String.valueOf(' ');

        System.out.println("Please enter something?");
        try {
            input = scanner.nextLine();
        } catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.printf("You entered: %s\n", input);
        if (StringUtils.isNumeric(input)){
            System.out.printf("%s is a number.\n", input);
        } else {
            System.out.printf("%s is not a number\n", input);
        }
        System.out.printf("Flipped: %s\n", StringUtils.swapCase(input));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(input));
    }
}