package no.bugs.homework2.baseOperation;

import java.util.Scanner;

public class ChangeVariable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("До обмена: a = " + a + ", b = " + b);
        changeVariable(a, b);

        sc.close();

    }

    /**
     Задача 5: Обмен значениями переменных
     Поменяйте значения двух переменных местами без использования третьей переменной.
     */

    public static void changeVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена: a = " + a + ", b = " + b);


    }


}
