package no.bugs.homework2.loop;

import java.util.Scanner;

public class Factorial {
    /**
     * Задача 4: Факториал числа
     * Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int a = sc.nextInt();
        sc.close();

        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        System.out.println("Факториал: " + factorial);
    }

}


