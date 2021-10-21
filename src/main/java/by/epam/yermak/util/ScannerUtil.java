package by.epam.yermak.util;

import java.util.Scanner;

public class ScannerUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String text) {
        while (true) {
            System.out.println(text);
            String inputStr = scanner.nextLine();

            try {
                return Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Input Error! Try again!");
            }
        }
    }
}
