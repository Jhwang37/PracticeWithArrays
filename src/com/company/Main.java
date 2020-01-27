package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

import static com.company.Print.printout;

public class Main {
    public static void main(String[] args) {
        Print print = new Print();


        int num = 0;
        int sum = 0;

        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < newArray.length; i++) {
            System.out.print("|" + newArray[i] + "|");
        }
        System.out.println("\n");

        for (int x = 0; x < newArray.length; x++) {
            sum = sum + x;
            System.out.print("|" + sum + "|");
        }

        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int[] numbs = new int[10];
        System.out.println("\nEnter numbers: ");
        for (int q = 0; q < numbs.length; q++) {
            numbs[q] = scan.nextInt();
        }
        for (int b = 0; b < numbs.length; b++) {
            sum1 = numbs[b] + sum1;
            System.out.println(sum1);
        }
        System.out.println("Total sum:" + sum1);

        int sum2 = 0;
        int[] numb1 = new int[10];
        System.out.println("Enter numbers: ");
        for (int v = 0; v < numb1.length; v++) {
            numb1[v] = scan.nextInt();
        }
        for (int n = 0; n < numb1.length; n++) {
            sum2 = numb1[n] + sum2;
        }
        int avg = sum2 / numb1.length;
        System.out.println("Average: " + avg);

        String[] names = {"James", "James1", "James2"};
        for (int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }

        int[] new1 = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        for (int i = 0; i < new1.length; i++) {
            if (new1[i] == 5) {
                System.out.println("Index: " + i + " ");
                System.out.println(new1[i]);
            } else {
                continue;
            }
        }

        int[] new2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = new2.length; i > 0; i--) {
            System.out.println(new2[i]);
        }

        String[] words = {"w", "t", "y", "h", "k"};
        for (int x = 0; x < words.length; x++) {
            if (words[x] == ("t")) {
                words[x] = "Hello";
            }
            printout(words);
        }

        int[] first = {1, 7, 6, 5, 9};
        int[] second = {2, 7, 6, 3, 4};

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    System.out.println(first[i] + " " + second[j]);
                }
            }
        }
    }
}

