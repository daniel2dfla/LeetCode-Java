package org.example;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] palavras = s.trim().split(" ");
        return palavras[palavras.length - 1].length();
    }
}
