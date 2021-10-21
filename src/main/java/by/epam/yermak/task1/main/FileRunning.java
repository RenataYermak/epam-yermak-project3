package by.epam.yermak.task1.main;

import by.epam.yermak.task1.entity.Array;
import by.epam.yermak.util.FileUtil;

public class FileRunning {
    public static final String FILE_PATH = "src/main/resources/task1.txt";

    public static void main(String[] args) throws Exception {
        Array array = new Array(FileUtil.getArrayFromFile(FILE_PATH));
        Running.run(array);
    }
}
