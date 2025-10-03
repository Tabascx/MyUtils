/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.myutils;

public class MyUtils {
    public static boolean esTraspas(int any) {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
        // Comentari, esteu a 2n curs, si escriviu un if aquí plantejeu passar-vos a cures auxiliars d'infermeria..
    }

    public static boolean esPrimer(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n ha de ser >= 0");
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
        // Recursivament és més elegant pero així és millor. Comentari afegit per fer justificar un commit
    }
}

