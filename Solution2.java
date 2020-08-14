import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        final int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; i + j < size; j++) {
                matrix[j][i + j] = i;
                matrix[i + j][j] = i;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
