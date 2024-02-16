package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        String[] tokens = input.split(" ");
        System.out.println(Arrays.toString(tokens));

        int result = 0;
        String operator = "";
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operator = token;
                continue;
            }
            int num = Integer.parseInt(token);
            switch (operator) {
                case "+":
                    result = result + num;
                    break;
                case "-":
                    result = result - num;
                    break;
                case "*":
                    result = result * num;
                    break;
                case "/":
                    result = result / num;
                    break;
                default:
                    result = num;
                    break;
            }
        }


        System.out.println("Result: " + result);
        System.exit(0);
    }
}
