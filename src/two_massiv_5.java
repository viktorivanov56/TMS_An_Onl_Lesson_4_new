import java.util.Arrays;

public class two_massiv_5 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 6, 10};
        int[] array2 = {3, 22, 43, 55, 80};

        System.out.print("Массив 1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Массив 2: ");
        System.out.println(Arrays.toString(array2));
        System.out.println("Среднее значение массива 1: " + average(array1));
        System.out.println("Среднее значение массива 2: " + average(array2));
        if (average(array1) > average(array2)) {
            System.out.println("Среднее значение первого массива больше ");
        } else if (average(array1) < average(array2)) {
            System.out.println("Среднее значение второго массива больше ");
        } else System.out.println("Средние значения равны!");
    }
    private static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return average;
    }
}
