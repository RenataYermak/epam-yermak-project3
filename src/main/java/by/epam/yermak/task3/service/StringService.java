package by.epam.yermak.task3.service;

public class StringService implements IStringService {
    @Override
    public String replaceSymbolOnIndex(String text, int index, char symbol) {
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0 && index > 0) {
            for (String word : text.split(" ")) {
                if (word.length() >= index) {
                    sb.append(word, 0, index - 1).append(symbol).append(word.substring(index));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public String replaceAWithOAfterP(String text, String regex, String replacement) {
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0) {
            for (String word : text.split(" ")) {
                word = word.replaceAll(regex, replacement);
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public String replaceWordGivenLengthSubstring(String text, int length, String replacement) {
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0) {
            for (String word : text.split(" ")) {
                if (word.length() == length) {
                    word = word.replace(word, replacement);
                    sb.append(word);
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public String removeNonLetter(String text) {
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
                    sb.append(text.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    @Override
    public String removeWordGivenLengthWithStartConsonant(String text, int length) {
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0) {
            for (String word : text.split(" ")) {
                if (word.length() == length && isConsonant(word)) {
                } else {
                    sb.append(word).append(" ");
                }
            }
        }
        return sb.toString();
    }

    public static boolean isConsonant(String word) {
        switch (word.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return false;
            default:
                return true;
        }
    }
}

