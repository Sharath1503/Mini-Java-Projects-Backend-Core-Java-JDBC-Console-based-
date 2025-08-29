package com.switchh.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Genex {

    public void min() throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A value:");
        int a = Integer.parseInt(obj.readLine());
        System.out.println("Enter B value:");
        int b = Integer.parseInt(obj.readLine());
        System.out.println("Enter C value:");
        int c = Integer.parseInt(obj.readLine());
        if (a <= b && a <= c) {
            System.out.println("A value is Minimum");
        } else if (b <= a && b <= c) {
            System.out.println("B value is Minimum");
        } else {
            System.out.println("C value is Minimum");
        }
    }

    public void max() throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A value:");
        int a = Integer.parseInt(obj.readLine());
        System.out.println("Enter B value:");
        int b = Integer.parseInt(obj.readLine());
        System.out.println("Enter C value:");
        int c = Integer.parseInt(obj.readLine());
        if (a >= b && a >= c) {
            System.out.println("A value is Maximum");
        } else if (b >= a && b >= c) {
            System.out.println("B value is Maximum");
        } else {
            System.out.println("C value is Maximum");
        }
    }

    public static void main(String[] args) throws IOException {
        Genex obj = new Genex();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Minimum Value");
        System.out.println("2.Maximum Value");
        System.out.println("\nEnter a Number to perform Operations:");
        int ch = Integer.parseInt(reader.readLine());
        switch (ch) {
            case 1:
                obj.min();
                break;
            case 2:
                obj.max();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
