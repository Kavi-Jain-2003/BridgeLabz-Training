//Write a program to perform matrix manipulation operations like addition, subtraction, and multiplication. The program should take random matrices as input and display the result of the operations.

//importing scanner class
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns for matrix A: ");
        int colsA = sc.nextInt();

        System.out.print("Enter rows for matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter columns for matrix B: ");
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible with these dimensions!");
            sc.close();
            return;
        }

        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition and subtraction require same dimensions
        if (rowsA == rowsB && colsA == colsB) {
            int[][] sum = addMatrices(matrixA, matrixB);
            int[][] diff = subtractMatrices(matrixA, matrixB);

            System.out.println("\nMatrix A + Matrix B:");
            displayMatrix(sum);
            System.out.println("\nMatrix A - Matrix B:");
            displayMatrix(diff);
        } else {
            System.out.println("\nAddition and subtraction not possible (dimensions mismatch).");
        }

        // Matrix multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nMatrix A * Matrix B:");
        displayMatrix(product);

//closing input
		sc.close();
	}
 // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random integers 0-9
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}