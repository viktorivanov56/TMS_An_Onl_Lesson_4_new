import java.util.Scanner;

public class massiv_cel_chis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 88};
        boolean result = false;

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();

        for (int temp : array) {
            if (temp == number) {
                result = true;
                break;
            }
        }

        if (result) {
            System.out.printf("Число %S входит в массив!", number);
        } else {
            System.out.printf("Число %S не входит в массив!", number);
        }
    }
}