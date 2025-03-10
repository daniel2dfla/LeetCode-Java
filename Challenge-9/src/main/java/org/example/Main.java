package org.example;

import java.util.Arrays;

import static org.example.Solution.solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 3, 7, 5, 9, 3, 5};
        int[] array2 = {7, 5, 8, 3, 9, 6, 5, 6};

        solution(array);
        solution(array2);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}