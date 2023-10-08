package baitap.baitap3;

import baitap.baitap2.Student;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng Bubble Sort:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng selectionSort:");
        printArray(arr);
        InsertionSort(arr);
        System.out.println("\nMảng sau khi sắp xếp bằng InsertionSort:");
        printArray(arr);
    }

    public static  String[] bubbleSort( String[] str){

        for (int i = 0; i <str.length-1 ; i++) {
            for (int j = 0; j < str.length-i-1; j++) {
                if(str[j+1].compareTo(str[j])<0) {
                    swap1(str, j+1,j);
                }
            }
        }
        return str;
    }

    public static String[] selectionSort(String[] str){
        for (int i = 0; i < str.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap1(str, minIndex, i);
        }
        return str;
    }

    public static String[] InsertionSort( String[] str) {
        for (int i = 1; i < str.length; i++) {
            for (int j = i; j > 0 && str[j-1].compareTo(str[j])>0; j--) {
                swap1(str, j - 1, j);
            }
        }
        return str;
    }
    private static void swap1(String[] str, int i1, int i2) {
        String temp = str[i1];
        str[i1] = str[i2];
        str[i2] = temp;
    }
    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

}
