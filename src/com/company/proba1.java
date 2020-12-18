package com.company;

import java.util.Arrays;

public class proba1 {

    public static void main(String[] args) {
        int[][] arrDemoVersion = new int[3][5];
        for (int i = 0; i < arrDemoVersion.length; i++) {
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                arrDemoVersion[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < arrDemoVersion.length; i++) {
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                System.out.print(arrDemoVersion[i][j] + "\t");
            }
            System.out.println();
        }
        int line = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                line++;
            }
        }
        System.out.println("Сортировка: ");
        int[] arr = new int[line];
        for (int i = 0; i < arrDemoVersion.length; i++) {
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                arr[j] = arrDemoVersion[i][j];

            }
            Arrays.sort(arr);
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                arrDemoVersion[i][j] = arr[j];
            }
        }
        for (int i = 0; i < arrDemoVersion.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arrDemoVersion[i].length; j++) {
                System.out.print(" " + arrDemoVersion[i][j] + "\t");
            }
            System.out.println();


        }
    }


}


