package no.bugs.homework2.nestedLoop;

import java.util.Scanner;

public class Rectangle {
    /**
     * Задача 2: Прямоугольник из звёздочек
     * Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ширину (N): ");
        int n = sc.nextInt();

        System.out.print("Введите высоту (M): ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}


