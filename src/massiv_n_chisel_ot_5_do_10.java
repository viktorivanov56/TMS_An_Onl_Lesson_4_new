import java.util.Arrays;
import java.util.Scanner;

public class massiv_n_chisel_ot_5_do_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean exit = false;

        System.out.print("Введите размер массива: ");

        while (!exit && scanner.hasNext()) {
            size = scanner.nextInt();
            if (size <= 5 || size > 10) {
                System.out.println("Неверный ввод. Размер может быть от 6 до 10 включительно. Повторите ввод.");
            } else {
                exit = true;
            }
        }

        int[] arrayOne = new int[size];
        int sizeNewArray = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 100);
            if (arrayOne[i] % 2 == 0) {
                sizeNewArray++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));

        if (sizeNewArray != 0) {
            int[] arrayNew = new int[sizeNewArray];
            for (int i = 0, j = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] % 2 == 0) {
                    arrayNew[j] = arrayOne[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(arrayNew));
        }
    }
}