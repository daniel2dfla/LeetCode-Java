package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] exemplo1 = {"flor", "fluxo", "flauta"};
        String[] exemplo2 = {"campeonato","caminhão","caminhar"};

        System.out.println(solution.maiorPrefixoComum(exemplo1));
        System.out.println(solution.maiorPrefixoComum(exemplo2));
    }
}