package by.epam.yermak.task2.service;

public class BubbleSort {
    RowSumma rowSumma = new RowSumma();
    MaxElementSort maxElementSort = new MaxElementSort();
    MinElementSort minElementSort = new MinElementSort();

    public void ascendingRowSum(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (rowSumma.compareArray(matrix[i], matrix[i + 1]) >= 0) {
                    changeRowArray(matrix, i + 1, i);
                }
            }
        }
        showMatrix(matrix);
    }

    public void descendingRowSum(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (rowSumma.compareArray(matrix[i], matrix[i + 1]) <= 0) {
                    changeRowArray(matrix, i, i + 1);
                }
            }
        }
        showMatrix(matrix);
    }

    public void ascendingMaxElementRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (maxElementSort.compareArray(matrix[j], matrix[j + 1]) >= 0) {
                    changeRowArray(matrix, matrix[i][j + 1], matrix[i][j]);
                }
            }
        }
        showMatrix(matrix);
    }

    public void descendingMaxElementRow(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (maxElementSort.compareArray(matrix[j], matrix[j + 1]) <= 0) {
                    changeRowArray(matrix, matrix[i][j], matrix[i][j + 1]);
                }
            }
        }
        showMatrix(matrix);
    }

    public void ascendingMinElementRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (minElementSort.compareArray(matrix[j], matrix[j + 1]) >= 0) {
                    changeRowArray(matrix, matrix[i][j], matrix[i][j + 1]);
                }
            }
        }
        showMatrix(matrix);
    }

    public void descendingMinElementRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (minElementSort.compareArray(matrix[j], matrix[j + 1]) <= 0) {
                    changeRowArray(matrix, matrix[i][j], matrix[i][j + 1]);
                }
            }
        }
        showMatrix(matrix);
    }

    public static void changeRowArray(int[][] array, int row, int nextRow) {
        int[] rowOfArray = array[nextRow];
        array[nextRow] = array[row];
        array[row] = rowOfArray;
    }


    private static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
