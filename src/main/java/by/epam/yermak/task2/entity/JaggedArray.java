package by.epam.yermak.task2.entity;

import by.epam.yermak.task2.service.BubbleSort;
import by.epam.yermak.task2.service.ICompareLogic;

import java.util.Arrays;

public class JaggedArray {
    private int[][] jaggedArray;
    BubbleSort bubbleSort = new BubbleSort();

    public JaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public void sort(SortType type) {
        switch (type) {
            case ROW_SUM_ASCENDING:
                bubbleSort.ascendingRowSum(jaggedArray);
            case ROW_SUM_DESCENDING:
                bubbleSort.descendingRowSum(jaggedArray);
            case MAX_ELEMENT_ASCENDING:
                bubbleSort.ascendingMaxElementRow(jaggedArray);
            case MAX_ELEMENT_DESCENDING:
                bubbleSort.descendingMaxElementRow(jaggedArray);
            case MIX_ELEMENT_ASCENDING:
                bubbleSort.ascendingMinElementRow(jaggedArray);
            case MIX_ELEMENT_DESCENDING:
                bubbleSort.descendingMinElementRow(jaggedArray);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray that = (JaggedArray) o;
        return Arrays.equals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(jaggedArray);
    }

    @Override
    public String toString() {
        return  Arrays.toString(jaggedArray);
    }
}
