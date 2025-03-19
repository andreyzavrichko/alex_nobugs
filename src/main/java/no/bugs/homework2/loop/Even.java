package no.bugs.homework2.loop;

import java.util.Scanner;

public class Even {
    /**
     Задача 5: Чётные числа до N
     Пользователь вводит число N. Выведите все чётные числа от 1 до N.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int a = sc.nextInt();
        sc.close();

        System.out.println("Чётные числа от 1 до " + a + ":");
        for (int i = 2; i <= a; i += 2) {
            System.out.print(i + " ");
        }
    }

}


