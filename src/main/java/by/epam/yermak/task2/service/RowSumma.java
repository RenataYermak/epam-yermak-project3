package by.epam.yermak.task2.service;

public class RowSumma implements ICompareLogic{
    private int rowSum(int[] row) {
        int sum = 0;
        for (int elem : row) {
            sum += elem;
        }
        return sum;
    }
    @Override
    public  int compareArray(int[] firstArray, int[] secondArray) {
        return Integer.compare(rowSum(firstArray), rowSum(secondArray));
    }
}

