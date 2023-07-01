/*

Q7.Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

*/
public class Solution7 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;

        while (num <= n * n) {
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = num++;
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = num++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    matrix[bottomRow][col] = num++;
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    matrix[row][leftCol] = num++;
                }
                leftCol++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);

        System.out.println("Generated Matrix:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
