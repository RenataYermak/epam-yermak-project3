package by.epam.yermak.task2.entity;

import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;
import by.epam.yermak.task2.service.ArrayService;

import java.util.Arrays;

public class JaggedArray {
    private final ArrayService arrayService;
    private final int[][] jaggedArray;
    private  int size;
    private int index;

    public JaggedArray(int size) {
        this.size = size;
        this.jaggedArray = new int[size][size-1];
        this.arrayService = new ArrayService(jaggedArray);
    }
    public JaggedArray(int [][] elements) {
        this.jaggedArray = elements;
        this.arrayService = new ArrayService(jaggedArray);
    }

    public int[][] getJaggedArray() {
        return jaggedArray;
    }
    public void add(int number) throws ArrayIndexOutOfBoundsException {
        if (index < size) {
            jaggedArray[index][index] = number;
            index++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void sort() {
        arrayService.bubbleSort();
    }

    public void sort(SortType type) {
        switch (type) {
            case ROW_SUM_ASCENDING: arrayService.bubbleSort();
           // case ROW_SUM_DESCENDING:
           // case MAX_ELEMENT_ASCENDING:
           // case MAX_ELEMENT_DESCENDING:
          //  case MIX_ELEMENT_ASCENDING:
         //   case MIX_ELEMENT_DESCENDING:
            default:
                sort();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray array = (JaggedArray) o;
        return Arrays.equals(jaggedArray, array.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(jaggedArray);
    }

    @Override
    public String toString() {
      return   Arrays.toString(jaggedArray);
    }
}

