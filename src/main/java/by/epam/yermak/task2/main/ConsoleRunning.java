package by.epam.yermak.task2.main;

import by.epam.yermak.task1.exception.ArrayIndexOutOfBoundsException;
import by.epam.yermak.task2.entity.JaggedArray;
import by.epam.yermak.util.ScannerUtil;

public class ConsoleRunning {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int size = ScannerUtil.scanner.nextInt();
        JaggedArray jaggedArray = new JaggedArray(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {
                jaggedArray.add(ScannerUtil.scanner.nextInt());
            }
        }
    }
}