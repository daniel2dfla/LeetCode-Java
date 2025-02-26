package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.lengthOfLastWord("Olá Daniel ")); // 5
        System.out.println(solution.lengthOfLastWord("fly me to the moon")); // 4
        System.out.println(solution.lengthOfLastWord("luffy ainda é joyboy")); // 6
    }
}