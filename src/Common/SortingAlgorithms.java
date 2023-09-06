/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

/**
 *
 * @author HI
 */
public class SortingAlgorithms {
    public void bubbleSort(int[] array){
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có sự hoán đổi ở vòng lặp trong, mảng đã sắp xếp xong
            if (!swapped) {
                break;
            }
        }
    }
    
    public int partition(int[] array, int left, int right) {
        //exam: 1 12 5 [7] 6 9 2 : 7 is pivot
        //Run from left: i - Run from right: j
        int i = left, j = right;
        //Instance a variable: pivot - trục
        int pivot = array[(left + right) / 2];
        //Create a temp variable
        int tmp;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                //Execute swap between value of index [i] and value of index [j]
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

    public void quickSort(int[] array, int left, int right) {
        //Search index of array - vách ngăn
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    /*
    public int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
    }*/
}
