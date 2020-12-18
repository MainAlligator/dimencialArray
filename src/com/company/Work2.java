package com.company;

public class Work2 {


    public static void main(String[] args) {


        int[][] arrayDemoSecond = new int[7][5];
        for (int i = 0; i < arrayDemoSecond.length; i++) {

            for (int j = 0; j < arrayDemoSecond[i].length; j++) {

                arrayDemoSecond[i][j] = ((int) (Math.random() * 10) - 4);
                System.out.print( arrayDemoSecond[i][j] + "\t ");
            }
            System.out.println("\n");
        }
        maxRowArray(arrayDemoSecond);
    }


    private static void maxRowArray(int[][] arrayCurrentTwo) {

        int max = Math.abs(arrayCurrentTwo[0][0]);
        for (int i = 0; i < arrayCurrentTwo.length; i++) {
            for (int j = 0; j < arrayCurrentTwo[i].length; j++) {
                if (Math.abs(arrayCurrentTwo[i][j]) >= max) {
                    max = Math.abs(arrayCurrentTwo[i][j]);
                } else if (max > arrayCurrentTwo[i][j]) {
                    max = Math.abs(arrayCurrentTwo[i][j]);
                }

            }
        }
            System.out.print(" Индекс строки с наибольшим по модулю произведением элементов: " + max + " строка.");
        }
    }

