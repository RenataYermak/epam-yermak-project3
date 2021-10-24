package by.epam.yermak.task3.main;


import by.epam.yermak.util.FileUtil;

public class FileRunning {
    public static final String FILE_PATH = "src/main/resources/task3.txt";

    public static void main(String[] args) throws Exception {
        String str = FileUtil.getTextFromFile(FILE_PATH);
        System.out.println(str);
    }
}
