package by.epam.yermak.task1.main;

import by.epam.yermak.task1.entity.Array;
import by.epam.yermak.task1.entity.SortType;
import by.epam.yermak.util.RandomUtil;

import java.util.Arrays;

public class Running {
    public static void run(Array array) {
        int searchingNumber = RandomUtil.getInt();
        System.out.println("Current array " + array);
        array.sort(SortType.BUBBLE_SORT);
        System.out.println(SortType.BUBBLE_SORT.type + " " + array);
        Integer tmp = array.search(searchingNumber);
        if (tmp != null) {
            System.out.println("Searching number is " + tmp);
        }
        System.out.println(
                "Min number " + array.getMinNumber());
        System.out.println(
                "Max number " + array.getMaxNumber());
        System.out.println(
                "Prime numbers " + Arrays.toString(array.getPrimeNumbers()));
        System.out.println(
                "Fibonacci numbers " + Arrays.toString(array.getFibonacciNumbers()));
        System.out.println(
                "Three digit numbers without the same numbs "
                        + Arrays.toString(array.getThreeDigitNumbersWithoutSameNumbs()));
    }
}
