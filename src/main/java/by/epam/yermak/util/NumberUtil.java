package by.epam.yermak.util;

public class NumberUtil {
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isThreeDigitNumberHasThreeDifferentDigits(int number) {
        String tmp = String.valueOf(number);
        return tmp.length() == 3
                && tmp.charAt(0) != tmp.charAt(1)
                && tmp.charAt(1) != tmp.charAt(2)
                && tmp.charAt(0) != tmp.charAt(2);
    }

    public static boolean isFibonacciNumber(int number) {
        return isPerfectSquare(5 * number * number + 4) ||
                isPerfectSquare(5 * number * number - 4);
    }

    public static boolean isPerfectSquare(int num) {
        int n = (int)(Math.sqrt(num));
        return (n * n == num);
    }
}

