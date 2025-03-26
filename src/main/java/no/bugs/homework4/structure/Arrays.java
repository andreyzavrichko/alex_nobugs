package no.bugs.homework4.structure;
// Задача 1: Массивы (Arrays)
public class Arrays {
    public static void main(String[] args) {
        int[] arrays = new int[]{10, 20, 30, 5, 8};

        System.out.println(sum(arrays));

    }


    static int sum(int[] arrays) {
        int res = 0;
        for (int item : arrays) {
            res += item;
        }
        return res;
    }
}
