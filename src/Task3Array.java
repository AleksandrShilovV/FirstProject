import java.util.Arrays;

public class Task3Array {
    /*
Практическое задание №3 - одномерный массив
Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.

1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.

2.Напишите программу, которая выводит все двузначные числа массива.

3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.

4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.

5.***Напишите программу, которая переворачивает массив в обратном порядке.
     */
    public static void main(String[] args) {
        int [] array = {3, 22, 1, 13, 4, 6, 16, 5};

        for(int i: array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i: array) {
                if (i > 9 && i < 100) {
                    System.out.println(i);
            }
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int sum = 0;
        for(int i: array) {
            sum += i;
        }
        System.out.println(sum);

        int middleSize = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (i == middleSize) {
                break;
            }
            int index = array.length - 1 - i;
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
