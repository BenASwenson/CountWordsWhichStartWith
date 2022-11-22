package com.sparta;

public class CountWordsWhichStartWith {

    public int countWords(String[] array, String c) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            array[i] = array[i].toLowerCase();
            if (array[i].startsWith(c)) {
                count += 1;
            }
        }
        return count;
    }

    public int countWordsInString(String string, String c) {

        String[] words = string.split("\\W+");
        for (int i = 0; i<words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        return countWords(words, c);
    }
}
