import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Исходный массив:");
        int count = 0;

        for (int i = 0;i < n; i++) {
            if(i % 2 != 0){
                for (int j = m - 1; j >= 0 ; j--) {
                    array[i][j] = count++;
                }
            }else {
                for (int j = 0; j < m; j++) {
                    array[i][j] = count++;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
