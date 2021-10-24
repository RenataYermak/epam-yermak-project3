package by.epam.yermak.task3.service;

public interface IStringService {
    String replaceSymbolOnIndex(String text, int index, char symbol);

    String replaceAWithOAfterP(String text, String regex, String replacement);

    String replaceWordGivenLengthSubstring(String text, int length, String replacement);

    String removeNonLetter(String text);

    String removeWordGivenLengthWithStartConsonant(String text, int length);
}

