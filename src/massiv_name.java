import java.util.Arrays;

public class massiv_name {
    public static void main(String[] args) {

        String[] arrayNames = {"Яша", "Ирина", "Анна", "Вова", "Саша"};
        System.out.println(Arrays.toString(arrayNames));
        Arrays.sort(arrayNames);
        System.out.println(Arrays.toString(arrayNames));
    }
}