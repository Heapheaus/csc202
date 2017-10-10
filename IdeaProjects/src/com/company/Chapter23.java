package com.company;

import java.util.Random;

//(Execution time for sorting) Write a program that obtains the execution time of
//        selection sort, bubble sort, merge sort, quick sort, heap sort, and radix sort for
//        input size 50,000, 100,000, 150,000, 200,000, 250,000, and 300,000. Your program
//        should create data randomly and print a table like this:
public class Chapter23 {
    public static void main(String[] args) {
        Random r = new Random();
//50
        double[] sel50 = new double[50000];
        for (int i = 0; i <50000; i++){
            sel50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel50 = System.currentTimeMillis();
        selectionSort(sel50);
        long endTimesel50 = System.currentTimeMillis();
        long executionTimesel50 = endTimesel50 - startTimesel50;

        int[] bubble50 = new int[50000];
        for (int i = 0; i <50000; i++){
            bubble50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub50 = System.currentTimeMillis();
        bubbleSort(bubble50);
        long endTimeBub50 = System.currentTimeMillis();
        long executionTimeBub50 = endTimeBub50 - startTimeBub50;

        int[] merge50 = new int[50000];
        for (int i = 0; i <50000; i++){
            merge50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM50 = System.currentTimeMillis();
        mergeSort(merge50);
        long endTimeM50 = System.currentTimeMillis();
        long executionTimeM50 = endTimeM50 - startTimeM50;

        int[] quick50 = new int[50000];
        for (int i = 0; i <50000; i++){
            quick50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ50 = System.currentTimeMillis();
        quickSort(quick50);
        long endTimeQ50 = System.currentTimeMillis();
        long executionTimeQ50 = endTimeQ50 - startTimeQ50;

        int[] heap50 = new int[50000];
        for (int i = 0; i <50000; i++){
            heap50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH50 = System.currentTimeMillis();
        HeapSort.sort(heap50);
        long endTimeH50 = System.currentTimeMillis();
        long executionTimeH50 = endTimeH50 - startTimeH50;

        int[] radix50 = new int[50000];
        for (int i = 0; i <50000; i++){
            radix50[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR50 = System.currentTimeMillis();
        RadixSort.sort(radix50);
        long endTimeR50 = System.currentTimeMillis();
        long executionTimeR50 = endTimeR50 - startTimeR50;
//100
        double[] sel100 = new double[100000];
        for (int i = 0; i <100000; i++){
            sel100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel100 = System.currentTimeMillis();
        selectionSort(sel100);
        long endTimesel100 = System.currentTimeMillis();
        long executionTimesel100 = endTimesel100 - startTimesel100;

        int[] bubble100 = new int[100000];
        for (int i = 0; i <100000; i++){
            bubble100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub100 = System.currentTimeMillis();
        bubbleSort(bubble100);
        long endTimeBub100 = System.currentTimeMillis();
        long executionTimeBub100 = endTimeBub100 - startTimeBub100;

        int[] merge100 = new int[100000];
        for (int i = 0; i <100000; i++){
            merge100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM100 = System.currentTimeMillis();
        mergeSort(merge100);
        long endTimeM100 = System.currentTimeMillis();
        long executionTimeM100 = endTimeM100 - startTimeM100;

        int[] quick100 = new int[100000];
        for (int i = 0; i <100000; i++){
            quick100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ100 = System.currentTimeMillis();
        quickSort(quick100);
        long endTimeQ100 = System.currentTimeMillis();
        long executionTimeQ100 = endTimeQ100 - startTimeQ100;

        int[] heap100 = new int[100000];
        for (int i = 0; i <100000; i++){
            heap100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH100 = System.currentTimeMillis();
        HeapSort.sort(heap100);
        long endTimeH100 = System.currentTimeMillis();
        long executionTimeH100 = endTimeH100 - startTimeH100;

        int[] radix100 = new int[100000];
        for (int i = 0; i <100000; i++){
            radix100[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR100 = System.currentTimeMillis();
        RadixSort.sort(radix50);
        long endTimeR100 = System.currentTimeMillis();
        long executionTimeR100 = endTimeR100 - startTimeR100;
//150
        double[] sel150 = new double[150000];
        for (int i = 0; i <150000; i++){
            sel150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel150 = System.currentTimeMillis();
        selectionSort(sel150);
        long endTimesel150 = System.currentTimeMillis();
        long executionTimesel150 = endTimesel150 - startTimesel150;

        int[] bubble150 = new int[150000];
        for (int i = 0; i <150000; i++){
            bubble150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub150 = System.currentTimeMillis();
        bubbleSort(bubble150);
        long endTimeBub150 = System.currentTimeMillis();
        long executionTimeBub150 = endTimeBub150 - startTimeBub150;

        int[] merge150 = new int[150000];
        for (int i = 0; i <150000; i++){
            merge150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM150 = System.currentTimeMillis();
        mergeSort(merge150);
        long endTimeM150 = System.currentTimeMillis();
        long executionTimeM150 = endTimeM150 - startTimeM150;

        int[] quick150 = new int[150000];
        for (int i = 0; i <150000; i++){
            quick150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ150 = System.currentTimeMillis();
        quickSort(quick150);
        long endTimeQ150 = System.currentTimeMillis();
        long executionTimeQ150 = endTimeQ150 - startTimeQ150;

        int[] heap150 = new int[150000];
        for (int i = 0; i <150000; i++){
            heap150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH150 = System.currentTimeMillis();
        HeapSort.sort(heap150);
        long endTimeH150 = System.currentTimeMillis();
        long executionTimeH150 = endTimeH150 - startTimeH150;

        int[] radix150 = new int[150000];
        for (int i = 0; i <150000; i++){
            radix150[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR150 = System.currentTimeMillis();
        RadixSort.sort(radix150);
        long endTimeR150 = System.currentTimeMillis();
        long executionTimeR150 = endTimeR150 - startTimeR150;
//200
        double[] sel200 = new double[200000];
        for (int i = 0; i <200000; i++){
            sel200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel200 = System.currentTimeMillis();
        selectionSort(sel200);
        long endTimesel200 = System.currentTimeMillis();
        long executionTimesel200 = endTimesel200 - startTimesel200;

        int[] bubble200 = new int[200000];
        for (int i = 0; i <200000; i++){
            bubble200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub200 = System.currentTimeMillis();
        bubbleSort(bubble200);
        long endTimeBub200 = System.currentTimeMillis();
        long executionTimeBub200 = endTimeBub200 - startTimeBub200;

        int[] merge200 = new int[200000];
        for (int i = 0; i <200000; i++){
            merge200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM200 = System.currentTimeMillis();
        mergeSort(merge200);
        long endTimeM200 = System.currentTimeMillis();
        long executionTimeM200 = endTimeM200 - startTimeM200;

        int[] quick200 = new int[200000];
        for (int i = 0; i <200000; i++){
            quick200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ200 = System.currentTimeMillis();
        quickSort(quick200);
        long endTimeQ200 = System.currentTimeMillis();
        long executionTimeQ200 = endTimeQ200 - startTimeQ200;

        int[] heap200 = new int[200000];
        for (int i = 0; i <200000; i++){
            heap200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH200 = System.currentTimeMillis();
        HeapSort.sort(heap200);
        long endTimeH200 = System.currentTimeMillis();
        long executionTimeH200 = endTimeH200 - startTimeH200;

        int[] radix200 = new int[200000];
        for (int i = 0; i <200000; i++){
            radix200[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR200 = System.currentTimeMillis();
        RadixSort.sort(radix200);
        long endTimeR200 = System.currentTimeMillis();
        long executionTimeR200 = endTimeR200 - startTimeR200;
//250
        double[] sel250 = new double[250000];
        for (int i = 0; i <250000; i++){
            sel250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel250 = System.currentTimeMillis();
        selectionSort(sel250);
        long endTimesel250 = System.currentTimeMillis();
        long executionTimesel250 = endTimesel250 - startTimesel250;

        int[] bubble250 = new int[250000];
        for (int i = 0; i <250000; i++){
            bubble250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub250 = System.currentTimeMillis();
        bubbleSort(bubble250);
        long endTimeBub250 = System.currentTimeMillis();
        long executionTimeBub250 = endTimeBub250 - startTimeBub250;

        int[] merge250 = new int[250000];
        for (int i = 0; i <250000; i++){
            merge250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM250 = System.currentTimeMillis();
        mergeSort(merge250);
        long endTimeM250 = System.currentTimeMillis();
        long executionTimeM250 = endTimeM250 - startTimeM250;

        int[] quick250 = new int[250000];
        for (int i = 0; i <250000; i++){
            quick250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ250 = System.currentTimeMillis();
        quickSort(quick250);
        long endTimeQ250 = System.currentTimeMillis();
        long executionTimeQ250 = endTimeQ250 - startTimeQ250;

        int[] heap250 = new int[250000];
        for (int i = 0; i <250000; i++){
            heap250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH250 = System.currentTimeMillis();
        HeapSort.sort(heap250);
        long endTimeH250 = System.currentTimeMillis();
        long executionTimeH250 = endTimeH250 - startTimeH250;

        int[] radix250 = new int[250000];
        for (int i = 0; i <250000; i++){
            radix250[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR250 = System.currentTimeMillis();
        RadixSort.sort(radix250);
        long endTimeR250 = System.currentTimeMillis();
        long executionTimeR250 = endTimeR250 - startTimeR250;
//300
        double[] sel300 = new double[300000];
        for (int i = 0; i <300000; i++){
            sel300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimesel300 = System.currentTimeMillis();
        selectionSort(sel50);
        long endTimesel300 = System.currentTimeMillis();
        long executionTimesel300 = endTimesel300 - startTimesel300;

        int[] bubble300 = new int[300000];
        for (int i = 0; i <300000; i++){
            bubble300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeBub300 = System.currentTimeMillis();
        bubbleSort(bubble300);
        long endTimeBub300 = System.currentTimeMillis();
        long executionTimeBub300 = endTimeBub300 - startTimeBub300;

        int[] merge300 = new int[300000];
        for (int i = 0; i <300000; i++){
            merge300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeM300 = System.currentTimeMillis();
        mergeSort(merge300);
        long endTimeM300 = System.currentTimeMillis();
        long executionTimeM300 = endTimeM300 - startTimeM300;

        int[] quick300 = new int[300000];
        for (int i = 0; i <300000; i++){
            quick300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeQ300 = System.currentTimeMillis();
        quickSort(quick300);
        long endTimeQ300 = System.currentTimeMillis();
        long executionTimeQ300 = endTimeQ300 - startTimeQ300;

        int[] heap300 = new int[300000];
        for (int i = 0; i <300000; i++){
            heap300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeH300 = System.currentTimeMillis();
        HeapSort.sort(heap300);
        long endTimeH300 = System.currentTimeMillis();
        long executionTimeH300 = endTimeH300 - startTimeH300;

        int[] radix300 = new int[300000];
        for (int i = 0; i <300000; i++){
            radix300[i] = r.nextInt(Integer.MAX_VALUE);
        }
        long startTimeR300 = System.currentTimeMillis();
        RadixSort.sort(radix300);
        long endTimeR300 = System.currentTimeMillis();
        long executionTimeR300 = endTimeR300 - startTimeR300;

        System.out.println("Array Size | Selection Sort | Bubble Sort | Merge Sort | Quick Sort | Heap Sort | Radix Sort");
        System.out.println("50,000: | "+executionTimesel50+" | "+executionTimeBub50+" | "+executionTimeM50+" | "
        +executionTimeQ50+" | "+executionTimeH50+" | "+executionTimeR50);
        System.out.println("100,000: | "+executionTimesel100+" | "+executionTimeBub100+" | "+executionTimeM100+" | "
                +executionTimeQ100+" | "+executionTimeH100+" | "+executionTimeR100);
        System.out.println("150,000: | "+executionTimesel150+" | "+executionTimeBub150+" | "+executionTimeM150+" | "
                +executionTimeQ150+" | "+executionTimeH150+" | "+executionTimeR150);
        System.out.println("200,000: | "+executionTimesel200+" | "+executionTimeBub200+" | "+executionTimeM200+" | "
                +executionTimeQ200+" | "+executionTimeH200+" | "+executionTimeR200);
        System.out.println("250,000: | "+executionTimesel250+" | "+executionTimeBub250+" | "+executionTimeM250+" | "
                +executionTimeQ250+" | "+executionTimeH250+" | "+executionTimeR250);
        System.out.println("300,000: | "+executionTimesel300+" | "+executionTimeBub300+" | "+executionTimeM300+" | "
                +executionTimeQ300+" | "+executionTimeH300+" | "+executionTimeR300);
    }
    public static void selectionSort(double[] list) {
         for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                    }
                }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                }
            }
        }
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                    }
                }
            }
    }
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
            }
        }
        public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
            temp[current3++] = list2[current2++];
            }
        while (current1 < list1.length)
            temp[current3++] = list1[current1++];
        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
        }
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }
    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;
            while (low <= high && list[high] > pivot)
                high--;
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
                }
        }
        while (high > first && list[high] >= pivot)
            high--;
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
            }
        else {
            return first;
            }
        }
}