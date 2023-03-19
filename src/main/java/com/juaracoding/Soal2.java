package com.juaracoding;

public class Soal2 {
    public static void main(String[] args) {

        int angka = 1;
        for (int i = 9; i >= 1; i--) {
            for (int k = angka; k <= i; k++) {
                if (k % 2 != 0) {
                    System.out.print(k);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
            angka += 1;
        }
    }
}
