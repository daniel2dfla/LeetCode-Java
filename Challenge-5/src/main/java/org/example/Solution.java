package org.example;

public class Solution {
    public String maiorPrefixoComum(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        };

        String prefixo = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefixo)) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                if (prefixo.isEmpty()) {
                    return "";
                }
            }
        }
        return prefixo;

    }
}
