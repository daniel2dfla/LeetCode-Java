package org.example;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Índices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Nenhum par encontrado.");
        }
    }
}