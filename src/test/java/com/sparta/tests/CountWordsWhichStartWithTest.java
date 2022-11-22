package com.sparta.tests;

import com.sparta.CountWordsWhichStartWith;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CountWordsWhichStartWithTest {

    @Test
    @DisplayName("Given a character 'T', CountWordsWhichStartWith returns 2 when given an array with two items which start with T")
    public void GivenCharacterT_returns2WhenProvidedArrayWith2WordsStartingWithT() {
        CountWordsWhichStartWith countWordsWhichStartWith = new CountWordsWhichStartWith();
        String[] words = new String[] {"The", "cat", "in", "the", "hat"};
        String letter = "T";
        // arrange
        int expected = 2;
        // act
        int result = countWordsWhichStartWith.countWords(words, letter);
        // assert
        assertEquals(expected, result);
    }

}
