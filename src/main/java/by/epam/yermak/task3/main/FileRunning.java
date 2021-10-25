package by.epam.yermak.task3.main;

import by.epam.yermak.task3.service.StringService;
import by.epam.yermak.util.FileUtil;

public class FileRunning {
    public static final String FILE_PATH = "src/main/resources/task3.txt";

    public static void main(String[] args) throws Exception {
        StringService stringService = new StringService();
        String text = FileUtil.getTextFromFile(FILE_PATH);
        System.out.println(text);

        System.out.println( stringService.replaceSymbolOnIndex(text,5,'Y'));
        System.out.println(stringService.replaceAWithOAfterP(text,"pa","po"));
        System.out.println(stringService.replaceWordGivenLengthSubstring(text,3, "meow"));
        System.out.println(stringService.removeNonLetter(text));
        System.out.println(stringService.removeWordGivenLengthWithStartConsonant(text,5));;
    }
}
