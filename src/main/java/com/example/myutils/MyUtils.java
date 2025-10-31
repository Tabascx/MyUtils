/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.example.myutils;

public class MyUtils {

    // Métodos originales

    public static boolean esTraspas(int any) {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
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
    }

    // Nuevos métodos

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static int extreureMaxim(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array buit");
        int max = array[0];
        for (int n : array) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int sumarDigits(int numero) {
        int suma = 0;
        numero = Math.abs(numero); // Para números negativos
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

    public static int properPrimer(int numero) {
        int candidate = numero + 1;
        while (!esPrimer(candidate)) candidate++;
        return candidate;
    }
}