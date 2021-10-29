package by.epam.yermak.task2.main;

import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;

import by.epam.yermak.task2.entity.JaggedArray;
import by.epam.yermak.task2.entity.SortType;
import by.epam.yermak.util.ScannerUtil;

public class ConsoleRunning {
    public static void main(String[] args) {
        int n = ScannerUtil.scanner.nextInt();
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ScannerUtil.scanner.nextInt();
            }
        }
        JaggedArray jaggedArray = new JaggedArray(matrix);
        jaggedArray.sort(SortType.ROW_SUM_ASCENDING);
        jaggedArray.sort(SortType.ROW_SUM_DESCENDING);
        jaggedArray.sort(SortType.MAX_ELEMENT_ASCENDING);
        JaggedArray.sort(SortType.MAX_ELEMENT_DESCENDING);
        JaggedArray.sort(SortType.MIX_ELEMENT_ASCENDING);
        JaggedArray.sort(SortType.MIX_ELEMENT_DESCENDING);
    }
}
