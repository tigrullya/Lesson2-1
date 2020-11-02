package ru.geekbrains.java;

public class Homework {
    public static void main(String[] args) {
// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0)
                System.out.println(array1[i] = 0);
            else
                System.out.println(array1[i] = 1);
        }


        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        {
            int[] array2 = new int[8];
            for (int i = 0, j = 0; i < array2.length; i++, j += 3) {
                array2[i] = j;
                System.out.print(array2[i] + " ");

            }
        }
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                System.out.println(array3[i] * 2);
            else System.out.println(array3[i]);

        }
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] array4 = new int[3][3];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[0].length; j++) {
                if ((i + j) % 2 == 0) array4[i][j] = 1;
                else array4[i][j] = 0;
                System.out.println(array4[i][j]);
            }

        }
        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        {
            int[] array5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int min = array5[0], max = array5[0], indMax = 0, indMin = 0;
            for (int i = 0; i < array5.length; i++) {
                if (array5[i] > max) {
                    max = array5[i];
                    indMax = i;
                }
                if (array5[i] < min) {
                    min = array5[i];
                    indMin = i;
                }
            }
            System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
            System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);

        }
    }
}
