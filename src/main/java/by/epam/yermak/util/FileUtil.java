package by.epam.yermak.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    public static int[] getArrayFromFile(String filePth) throws IOException {
        FileReader fr = new FileReader(filePth);
        Scanner scan = new Scanner(fr);

        int length = 0;
        while (scan.hasNextInt()) {
            scan.nextInt();
            length++;
        }
        int[] array = new int[length];
        fr.close();
        fr = new FileReader(filePth);
        scan = new Scanner(fr);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        fr.close();
        return array;
    }

    public static String getTextFromFile(String filePth) throws IOException {
        FileReader fr = new FileReader(filePth);
        Scanner scan = new Scanner(fr);

        StringBuilder text = new StringBuilder();
        while (scan.hasNextLine()) {
            text.append(scan.nextLine());
        }
        return text.toString();
    }
}

