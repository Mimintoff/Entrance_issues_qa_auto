package ru.ifellow.qa_auto.time.differents;

import java.util.Scanner;

import static ru.ifellow.qa_auto.time.differents.СalculateAngle.calculateAngle;

public class Time_angle {

          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter the clock:");
              int hours = scanner.nextInt();
              System.out.println("Enter minutes:");
              int minutes = scanner.nextInt();
              double angle = calculateAngle(hours, minutes);
              System.out.println("The angle between the arrows: " + angle);
        }


    }

