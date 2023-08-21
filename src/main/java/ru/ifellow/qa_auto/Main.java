package ru.ifellow.qa_auto;

import java.util.Scanner;

import static ru.ifellow.qa_auto.Converter.convertToFahrenheit;
import static ru.ifellow.qa_auto.Converter.convertToKelvin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы по Цельсию: ");
        double celsius = scanner.nextDouble();
        System.out.println("Выберите конвертацию: 1 - в Кельвины, 2 - в Фаренгейты");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("В Кельвинах: " + convertToKelvin(celsius));
                break;
            case 2:
                System.out.println("В Фаренгейтах: " + convertToFahrenheit(celsius));
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }
}