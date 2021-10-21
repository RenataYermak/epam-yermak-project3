package by.epam.yermak.task2.service;

public class ArrayService implements IArrayService {
    private final int[][] jaggedArray;
    private int[] array;

    public ArrayService(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    @Override
    public void bubbleSort() {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                for (int k = 0; k < jaggedArray[i].length - 1; k++) {
                    if (jaggedArray[i][k] > jaggedArray[i][k + 1]) {
                        int temp = jaggedArray[i][k];
                        jaggedArray[i][k] = jaggedArray[i][k + 1];
                        jaggedArray[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    @Override
    public int getMinElementRow() {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    @Override
    public int getMaxElementRow() {
        int maxValue = array[0];
        for (int value : array) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    @Override
    public int rowSum() {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
