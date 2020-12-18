package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] arrayDemo = new int[6][9];

        for (int i = 0; i < arrayDemo.length; i++) {

            for (int j = 0; j < arrayDemo[i].length; j++) {

                arrayDemo[i][j] = ((int) (Math.random() * 200) - 99);

                System.out.print(" " + arrayDemo[i][j] + " ");
            }

            System.out.println("  " + "\n" + "   ");
        }
        getMaxNumber(arrayDemo);
    }

    private static void getMaxNumber(int[][] arrayCurrent) {

        int maxNumber = 0;
        for (int i = 0; i < arrayCurrent.length; i++) {

            for (int j = 0; j < arrayCurrent[i].length; j++) {

                if (maxNumber < arrayCurrent[i][j]) {

                    maxNumber = arrayCurrent[i][j];
                }
            }
        }
        System.out.println("Максимальное число:  " + maxNumber);
        System.out.println();
    }
}









