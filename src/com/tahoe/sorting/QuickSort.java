package com.tahoe.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void qSort(int[] A, int left, int right) {
        if (!(left < right)) {
            return;
        }

        int p = partition(A, left, right);

        qSort(A, left, p-1);
        qSort(A, p+1, right);

    }

    public static int partition(int[] A, int left, int right) {

        int pivot = A[right];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (A[j] <= pivot) {
                i++;
                swap(A, i, j);
            }
        }

        i++;

        swap(A, i, right);

        return i;

    }

    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Hello Sir");

        int[] A = {3, 12, 2, 1, 1, 10, 5, 5};

        qSort(A, 0, A.length - 1);

        System.out.println("A = " + Arrays.toString(A));
    }
}