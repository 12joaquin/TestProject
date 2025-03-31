package com.example;

import java.math.BigInteger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LargeFibonacci {
    public static void main(String[] args) {
        int n = 10000; // Number of Fibonacci numbers to compute
        String fileName = "fibonacci_output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;

            // First Fibonacci number
            writer.write(a.toString());
            writer.newLine();

            for (int i = 1; i < n; i++) {
                writer.write(b.toString());
                writer.newLine();

                BigInteger temp = b;
                b = b.add(a);
                a = temp;
            }

            System.out.println("Fibonacci sequence written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
