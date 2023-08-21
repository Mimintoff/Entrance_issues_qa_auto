package ru.ifellow.qa_auto.recurring_character;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    protected static void findDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : characters) {
            if (Character.isLetter(ch)) {
                if (charMap.containsKey(ch)) {
                    charMap.put(ch, charMap.get(ch) + 1);
                } else {
                    charMap.put(ch, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}
