import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] matrix = new int[input][input];
        int num = 1;
        int start = 1;
        int end = input;
        int startEnd = 2;



        for (int i = 0; i < input; i++) {
            for (int j = start; j < end; j++) {
                matrix[i][j] = num;
                num++;
                if (j == end - 1) {
//                    end = end - 1;
                    num = 1;
                    start++;
                }
            }
        }

        for (int i = input - 1; i >= 0; i--) {
            for (int j = input - startEnd; j >= 0; j--) {
                matrix[i][j] = num;
                num++;
                if (j == 0 ) {
                    num = 1;
                    startEnd++;
                }
            }
        }

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
