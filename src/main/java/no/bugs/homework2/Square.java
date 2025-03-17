package no.bugs.homework2;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ширина: ");
        int a = sc.nextInt();
        System.out.print("Длина: ");
        int b = sc.nextInt();

        square(a, b);

        sc.close();

    }

/**
 Задача 2: Площадь прямоугольника
 Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
 */

    public static void square(int a, int b) {
        int res = a * b;
        System.out.println("Площадь: " + res);

    }


}
