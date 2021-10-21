package by.epam.yermak.util;

public class Constant {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ERROR_MESSAGE =
            ANSI_RED + "SearchingError: No such number [%s] in array" + ANSI_RESET;
}
