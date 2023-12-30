import java.util.Arrays;
import java.util.Scanner;

public class Max_min_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);

            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Max", maxValue);
        System.out.printf("Min", minValue);
        System.out.printf("Average", sum / array.length);
    }
}