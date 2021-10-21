package by.epam.yermak.task1.main;

import by.epam.yermak.task1.entity.Array;
import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;
import by.epam.yermak.util.ScannerUtil;

public class ConsoleRunning {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int size = ScannerUtil.scanner.nextInt();
        Array array = new Array(size);
        for (int i = 0; i < size; i++) {
            array.add(ScannerUtil.scanner.nextInt());
        }
        Running.run(array);
    }
}

