package by.epam.yermak.task1.service;

import by.epam.yermak.task1.exception.NoSuchNumberException;

public interface IArrayService {
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    int search(int number) throws NoSuchNumberException;
    int getMinNumber();
    int getMaxNumber();
    int[] getPrimeNumbers();
    int[] getFibonacciNumbers();
    int[] getThreeDigitNumbersWithoutSameNumbs();
}

