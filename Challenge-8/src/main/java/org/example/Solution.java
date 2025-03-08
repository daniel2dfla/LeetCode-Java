package org.example;

public class Solution {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
