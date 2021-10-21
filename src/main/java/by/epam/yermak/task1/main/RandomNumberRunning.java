package by.epam.yermak.task1.main;

import by.epam.yermak.task1.entity.Array;
import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;
import by.epam.yermak.util.RandomUtil;

public class RandomNumberRunning {
    private static final int LENGTH = 10;

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Array array = new Array(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            array.add(RandomUtil.getInt());
        }
        Running.run(array);
    }
}
