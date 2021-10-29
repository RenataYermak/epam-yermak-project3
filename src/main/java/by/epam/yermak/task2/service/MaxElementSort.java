package by.epam.yermak.task2.service;

public class MaxElementSort implements ICompareLogic{
    private int maxElement(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (maxValue < value) {
                maxValue = value;
            }

        }
        return maxValue;
    }
    @Override
    public int compareArray(int[] firstArray, int[] secondArray) {
        return Integer.compare(maxElement(firstArray), maxElement(secondArray));
    }
}

