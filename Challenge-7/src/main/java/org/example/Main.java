package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(13531));  // Deve retornar true
        System.out.println(solution.isPalindrome(-13531));  // Deve retornar false
        System.out.println(solution.isPalindrome(31));  // Deve retornar false
        System.out.println(solution.isPalindrome(19991));  // Deve retornar true

    }
}