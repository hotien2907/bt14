package baitap.baitap1;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                   swap( arr,j,  j+1);
                }
            }
        }
    }

    private static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap( arr,minIndex,  i);

        }
    }


    private static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }

    private static void swap(int arr[], int i1, int i2) {
        if (i1 == i2) return;

        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }

    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp nổi bọt:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chọn:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}

