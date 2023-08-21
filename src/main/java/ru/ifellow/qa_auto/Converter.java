package ru.ifellow.qa_auto;

interface Converter {

    static double convertToKelvin (double celsius) {
        return celsius + 273.15;
    }

    static double convertToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

}




