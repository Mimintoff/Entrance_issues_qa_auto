package ru.ifellow.qa_auto.converter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Select Conversion: 1 - in Kelvins, 2 - in Fahrenheit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("in Kelvins: " + Converter.convertToKelvin(celsius));
                break;
            case 2:
                System.out.println("in Fahrenheit: " + Converter.convertToFahrenheit(celsius));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}