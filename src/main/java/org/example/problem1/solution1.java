package org.example.problem1;

/*
* implement basic operations for an Array data structure
* */
public class solution1 {

    public static int[] insertAtIndex(int[] arr, int data, int index) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = data;

        for (int i = index; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;
    }

    public static int[] insertAtBeginning(int[] arr, int data) {

        int[] newArr = new int[arr.length + 1];

        newArr[0] = data;

        for (int i = 0; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;
    }

    public static int[] insertAtEnd(int[] arr, int data) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = data;

        return newArr;
    }

    public static void sort(int[] arr) {

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static int[] deleteAtIndex(int[] arr, int index) {

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();

        int[] newArr = insertAtIndex(arr, 10, 2);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        newArr = insertAtBeginning(newArr, 15);

        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        newArr = insertAtEnd(newArr, 41);

        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        System.out.println();

        sort(newArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        newArr = deleteAtIndex(newArr, 6);

        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
