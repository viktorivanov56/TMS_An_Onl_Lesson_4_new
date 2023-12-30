import java.util.Arrays;
import java.util.Scanner;
public class massiv_delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 4, 3, 15, 17, 20, 7};
        int count = 0;
        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();
        for (int i : array) {
            if (number == i) {
                count++;
            }
        }
        if (count != 0) {
            int[] newArray = new int[array.length - count];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (number != array[i]) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            System.out.printf("Старый массив: %S \n", Arrays.toString(array));
            System.out.printf("Новый массив: %S \n", Arrays.toString(newArray));
        } else {
            System.out.printf("Числа %S  нет в массиве %S !", number, Arrays.toString(array));
        }
    }
}