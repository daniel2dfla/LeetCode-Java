package org.example;
import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger (a, 2);
        BigInteger num2 = new BigInteger (b, 2);

        BigInteger soma = num1.add(num2);

        String resultado = soma.toString(2);

        return resultado;
    }
}
