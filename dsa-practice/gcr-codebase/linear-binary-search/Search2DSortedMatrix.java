public class Search2DSortedMatrix {

    // Function to search target in 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }

        return false; // Target not found
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        int target1 = 9;
        int target2 = 8;

        System.out.println("Is " + target1 + " present? " + searchMatrix(matrix, target1));
        System.out.println("Is " + target2 + " present? " + searchMatrix(matrix, target2));
    }
}
