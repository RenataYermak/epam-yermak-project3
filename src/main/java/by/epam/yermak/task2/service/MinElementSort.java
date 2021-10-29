package by.epam.yermak.task2.service;

public class MinElementSort implements ICompareLogic {
    private int minElement(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value) {
                minValue = value;
            }

        }
        return minValue;
    }
    @Override
    public int compareArray(int[] firstArray, int[] secondArray) {
        return Integer.compare(minElement(firstArray), minElement(secondArray));
    }
}
