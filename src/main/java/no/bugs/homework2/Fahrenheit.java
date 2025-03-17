package no.bugs.homework2;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите температуру в Цельсиях: ");
        int a = sc.nextInt();

        convertDeg(a);

        sc.close();

    }

    /**
     * Задача 4: Перевод градусов Цельсия в Фаренгейты
     * Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
     */

    public static void convertDeg(int a) {
        int res = a * 9 / 5 + 32;
        System.out.println("Температура в Фаренгейтах: " + res);


    }


}
