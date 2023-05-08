import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please, input square matrix's size: ");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        System.out.println("Now print " + matrixSize * matrixSize + " values (NOTE: if you try to add more values, they'll be ignored) ");

        // input matrix's values
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i <= matrixSize - 1 || j <= matrixSize - 1) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    break;
                }
            }
        }

        // print matrix
        System.out.println("This is the matrix:");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(mainDiagonal(matrix));
        System.out.println(overMainDiagonal(matrix));
        System.out.println(underMainDiagonal(matrix));

        System.out.println(secondaryDiagonal(matrix));
        System.out.println(overSecondaryDiagonal(matrix));
        System.out.println(underSecondaryDiagonal(matrix));

        System.out.println(stairSum(matrix));
    }

    static int mainDiagonal(int[][] squareMatrix) {
        int mainDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i == j) {
                    mainDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return mainDiagonalSum;
    }

    static int overMainDiagonal(int[][] squareMatrix) {
        int overMainDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i < j) {
                    overMainDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return overMainDiagonalSum;
    }

    static int underMainDiagonal(int[][] squareMatrix) {
        int underMainDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i > j) {
                    underMainDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return underMainDiagonalSum;
    }

    static int secondaryDiagonal(int[][] squareMatrix) {
        int secondaryDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i + j == squareMatrix.length - 1) {
                    secondaryDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return secondaryDiagonalSum;
    }

    static int overSecondaryDiagonal(int[][] squareMatrix) {
        int overSecondaryDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i + j < squareMatrix.length - 1) {
                    overSecondaryDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return overSecondaryDiagonalSum;
    }

    static int underSecondaryDiagonal(int[][] squareMatrix) {
        int underSecondaryDiagonalSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (i + j >= squareMatrix.length) {
                    underSecondaryDiagonalSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return underSecondaryDiagonalSum;
    }

    static int stairSum(int[][] squareMatrix) {
        int stairSum = 0;
        System.out.println("These are the elements: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    stairSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    stairSum += squareMatrix[i][j];
                    System.out.print(squareMatrix[i][j] + " ");
                }
            }
        }
        System.out.print("the answer is ");
        return stairSum;
    }

}