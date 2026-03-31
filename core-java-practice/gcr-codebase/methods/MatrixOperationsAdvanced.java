//Write a program to perform matrix manipulation operations like finding the transpose, determinant, and inverse of a matrix. The program should take random matrices as input and display the result of the operations.

//importing scanner class
import java.util.Random;
import java.util.Scanner;

public class MatrixOperationsAdvanced {
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
         System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        double[][] matrix = createRandomMatrix(n, n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        // Transpose
        double[][] transpose = transposeMatrix(matrix);
        System.out.println("\nTranspose of Matrix:");
        displayMatrix(transpose);

        // Determinant
        double det = (n == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.println("\nDeterminant: " + det);

        // Inverse
        double[][] inverse = (n == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
        if (inverse != null) {
            System.out.println("\nInverse of Matrix:");
            displayMatrix(inverse);
        }
//closing input
            sc.close();
        }

     // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random integers 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Method to calculate determinant of 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
    }

    // Method to calculate inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1]/det;
        inverse[0][1] = -matrix[0][1]/det;
        inverse[1][0] = -matrix[1][0]/det;
        inverse[1][1] = matrix[0][0]/det;
        return inverse;
    }

    // Method to calculate inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])/det;
        inverse[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1])/det;
        inverse[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1])/det;

        inverse[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])/det;
        inverse[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0])/det;
        inverse[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0])/det;

        inverse[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0])/det;
        inverse[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0])/det;
        inverse[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0])/det;

        return inverse;
    }
}