package by.epam.yermak.task2.main;

import by.epam.yermak.task2.entity.JaggedArray;
import by.epam.yermak.task2.entity.SortType;

public class Running {
    public static void run(JaggedArray jaggetArray) {
        System.out.println("Current array " + jaggetArray);
        jaggetArray.sort(SortType.ROW_SUM_ASCENDING);
        System.out.println(SortType.ROW_SUM_ASCENDING.type + " " + jaggetArray);

    }
}