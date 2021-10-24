package by.epam.yermak.task3.main;

import by.epam.yermak.task3.service.StringService;
import by.epam.yermak.util.ScannerUtil;

public class ConsoleRunning {
 //   private static final StringService stringService = new StringService();
    public static void main(String[] args) {
        StringService stringService2 = new StringService();
        String text = ScannerUtil.readString("Enter the text");
        System.out.println(text);
        System.out.println( stringService2.replaceSymbolOnIndex(text,5,'Y'));
    }
}
