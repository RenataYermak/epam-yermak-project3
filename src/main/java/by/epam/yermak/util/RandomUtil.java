package by.epam.yermak.util;

public class RandomUtil {
    public static int getInt() {
        int min = 100;
        int max = 999;
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
