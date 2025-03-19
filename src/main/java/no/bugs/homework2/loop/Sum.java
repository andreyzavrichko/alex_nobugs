package no.bugs.homework2.loop;

import java.util.Scanner;

public class Sum {
    /**
     * Задача 2: Сумма чисел от 1 до N
     * Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int a = sc.nextInt();
        sc.close();
        int sum = (a * (a + 1)) / 2;
        System.out.println("Сумма: " + sum);
    }

}
