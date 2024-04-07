import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int line = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[line][column];

        System.out.print("Исходный массив:");

        for (int i = 0;i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(array));


        System.out.println("Введите число которое нужно прибавить к каждому элементу массива");
        int number = scanner.nextInt();
        int sum = 0;

        System.out.print("Массив с добавленным числом к каждому элементу:");
        for (int i = 0;i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] += number;
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));

        System.out.println("Сумма всех элементов массива = " + sum);
    }
}