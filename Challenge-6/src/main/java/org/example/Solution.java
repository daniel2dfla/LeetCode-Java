package org.example;

public class Solution {
    public int buscaInsercao(int[] nums, int alvo) {
        int esquerda = 0;
        int direita = nums.length - 1;

        while(esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if(nums[meio] == alvo) {
                return meio;
            } else if (nums[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return esquerda;
    };
};
