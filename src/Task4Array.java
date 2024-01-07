import java.util.Arrays;

public class Task4Array {
    public static void main(String[] args) {
        int [][] array = new int[4][3];
        System.out.println("Print array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //1
        System.out.println("Sum lines");
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            System.out.println(i + " " + sum);
        }
        //2
        System.out.println("Sum columns");
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.println(i + " " + sum);
        }
        //4
        System.out.println("Middle num:");
        for (int i = 0; i < array.length; i++) {
            int num = 0;
            for (int j = 0; j < array[0].length; j++) {
                num += array[i][j];
            }
            System.out.println(num / array.length);
        }
        //5
        int length = array.length * array[0].length;
        int[] arrayTwo = new int[length];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arrayTwo[num++] = array[i][j];
            }
        }
        System.out.println(Arrays.toString(arrayTwo));
        //3
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 0)
                    array[i][j] = 0;
                else array[i][j] = 1;
            }
        }
        System.out.println("Print 0 or 1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
