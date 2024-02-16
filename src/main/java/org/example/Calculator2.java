package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        String[] tokens = lexicalAnalysis(input);
        System.out.println(Arrays.toString(tokens));

        int result = 0;
        String operator = "";
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (isOperator(token)) {
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

    static String[] lexicalAnalysis(String input) {
        List<String> list = new ArrayList<>();

        String temporary = "";
        for (int position = 0; position < input.length(); position++) {
            char current = input.charAt(position);
            if (Character.isDigit(current)) {
                //
            } else if (isOperator(Character.toString(current))) {
                //
            }
        }
//
        String[] tokens = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tokens[i] = list.get(i);
        }

//        return tokens;

        return input.split(" ");
    }

    static public boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }
}
