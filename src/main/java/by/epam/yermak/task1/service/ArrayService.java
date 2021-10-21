package by.epam.yermak.task1.service;

import by.epam.yermak.task1.entity.Array;
import by.epam.yermak.task1.exception.NoSuchNumberException;
import static by.epam.yermak.util.Constant.ERROR_MESSAGE;
import static by.epam.yermak.util.NumberUtil.*;

public class ArrayService implements IArrayService {
    private final int[] array;

    public ArrayService(int[] array) {
        this.array = array;
    }

    @Override
    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    @Override
    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    @Override
    public void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int tmp = array[i];
            array[i] = min;
            array[minId] = tmp;
        }
    }

    @Override
    public int search(int number) throws NoSuchNumberException {
        Array tmp = new Array(this.array);
        tmp.sort();
        int index = binarySearch(tmp.getArray(), number, 0, array.length - 1);
        if (index >= 0) {
            return tmp.getArray()[index];
        } else {
            throw new NoSuchNumberException(String.format(ERROR_MESSAGE, number));
        }
    }
    public int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    @Override
    public int getMinNumber() {
        int minValue = array[0];
        for (int element : array) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    @Override
    public int getMaxNumber() {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public int[] getPrimeNumbers() {
        int size = 0;
        for (int element : array) {
            if (isPrimeNumber(element)) {
                size++;
            }
        }
        int[] tmp = new int[size];
        if (size == 0) {
            return tmp;
        }
        int i = 0;
        for (int element : array) {
            if (isPrimeNumber(element)) {
                tmp[i] = element;
                i++;
            }
        }
        return tmp;
    }

    @Override
    public int[] getFibonacciNumbers() {
        int size = 0;
        for (int element : array) {
            if (isFibonacciNumber(element)) {
                size++;
            }
        }
        int[] tmp = new int[size];
        if (size == 0) {
            return tmp;
        }
        int i = 0;
        for (int element : array) {
            if (isFibonacciNumber(element)) {
                tmp[i] = element;
                i++;
            }
        }
        return tmp;
    }

    @Override
    public int[] getThreeDigitNumbersWithoutSameNumbs() {
        int size = 0;
        for (int element : array) {
            if (isThreeDigitNumberHasThreeDifferentDigits(element)) {
                size++;
            }
        }
        int[] tmp = new int[size];
        if (size == 0) {
            return tmp;
        }
        int i = 0;
        for (int element : array) {
            if (isThreeDigitNumberHasThreeDifferentDigits(element)) {
                tmp[i] = element;
                i++;
            }
        }
        return tmp;
    }
}
