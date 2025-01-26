package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);

        System.out.println("Enter the second binary number:");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);

        Binary sum = Binary.add(binary1, binary2);
        Binary orResult = Binary.or(binary1, binary2);
        Binary andResult = Binary.and(binary1, binary2);
        Binary multiplyResult = Binary.multiply(binary1, binary2);

        System.out.println("First binary number: " + binary1.getValue());
        System.out.println("Second binary number: " + binary2.getValue());
        System.out.println("Addition result: " + sum.getValue());
        System.out.println("OR result: " + orResult.getValue());
        System.out.println("AND result: " + andResult.getValue());
        System.out.println("Multiplication result: " + multiplyResult.getValue());

        scanner.close();
    }
}

