package ru.ifellow.qa_auto.recurring_character;

import java.util.Scanner;

import static ru.ifellow.qa_auto.recurring_character.DuplicateCharacters.findDuplicateCharacters;

public class Hello_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        findDuplicateCharacters(word);
    }
}