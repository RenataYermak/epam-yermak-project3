package by.epam.yermak.util;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static String readString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
}
