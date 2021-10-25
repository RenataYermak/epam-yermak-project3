package by.epam.yermak.task3.main;

import by.epam.yermak.task3.service.StringService;
import by.epam.yermak.util.ScannerUtil;

public class ConsoleRunning {

    public static void main(String[] args) {
        StringService stringService = new StringService();
        String text = ScannerUtil.readString("Enter the text");

        System.out.println( stringService.replaceSymbolOnIndex(text,6,'Y'));
        System.out.println(stringService.replaceAWithOAfterP(text,"pa","po"));
        System.out.println(stringService.replaceWordGivenLengthSubstring(text,3, "mya"));
        System.out.println(stringService.removeNonLetter(text));
        System.out.println(stringService.removeWordGivenLengthWithStartConsonant(text,3));
    }
}
