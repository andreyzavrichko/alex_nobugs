package no.bugs.homework6.task4;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Индекс последнего элемента в nums1
        int j = n - 1; // Индекс последнего элемента в nums2
        int k = m + n - 1; // Индекс последней позиции в объединенном массиве

        // Слияние массивов, начиная с конца
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Копирование оставшихся элементов из nums2 (если есть)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        System.out.println(Arrays.toString(nums1));
    }


}
