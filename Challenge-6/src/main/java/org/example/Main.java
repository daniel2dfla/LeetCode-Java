package org.example;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,3,5,6};
        int[] nums2 = { 1, 2, 5, 7, 9, 10, 45};

        System.out.println(solution.buscaInsercao(nums1 , 4));
        System.out.println(solution.buscaInsercao(nums2 , 11));
        System.out.println(solution.buscaInsercao(nums2 , 49));
    }
}