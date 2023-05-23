package com.github.kyriosdata.ufg.poo.t07;

public class Permuta {

    /**
     * Método que recebe uma sequência de caracters (String)
     * e produz todas as permutações possíveis dos caracteres
     * desta sequência.
     */
    public static void permuta(String prefixo, String str) {
        if (str.length() == 0) {
            System.out.println(prefixo);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permuta(prefixo + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
            }
        }
    }
}
