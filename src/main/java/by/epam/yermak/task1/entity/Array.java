package by.epam.yermak.task1.entity;

import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;
import by.epam.yermak.task1.exception.NoSuchNumberException;
import by.epam.yermak.task1.service.ArrayService;

import java.util.Arrays;

public class Array {
    private final ArrayService arrayService;
    private final int[] array;
    private final int size;
    private int index;

    public Array(int size) {
        this.size = size;
        this.array = new int[size];
        this.arrayService = new ArrayService(array);
    }

    public Array(int... elements) {
        this.array = elements;
        this.size = elements.length;
        this.index = elements.length;
        this.arrayService = new ArrayService(array);
    }

    public void add(int number) throws ArrayIndexOutOfBoundsException {
        if (index < size) {
            array[index] = number;
            index++;
        } else {
            throw new ArrayIndexOutOfBoundsException();

        }
    }

    public int size() {
        return size;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        arrayService.bubbleSort();
    }

    public void sort(SortType type) {
        switch (type) {
            case BUBBLE_SORT: arrayService.bubbleSort();
            case INSERTION_SORT: arrayService.insertionSort();
            case SELECTION_SORT: arrayService.selectionSort();
            default: sort();
        }
    }

    public Integer search(int element) {
        Integer tmp = null;
        try {
            tmp = arrayService.search(element);
        } catch (NoSuchNumberException ex) {
            System.out.println(ex.getMessage());
        }
        return tmp;
    }

    public int getMinNumber() {
        return arrayService.getMinNumber();
    }

    public int getMaxNumber() {
        return arrayService.getMaxNumber();
    }

    public int[] getPrimeNumbers() {
        return arrayService.getPrimeNumbers();
    }

    public int[] getFibonacciNumbers() {
        return arrayService.getFibonacciNumbers();
    }

    public int[] getThreeDigitNumbersWithoutSameNumbs() {
        return arrayService.getThreeDigitNumbersWithoutSameNumbs();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
