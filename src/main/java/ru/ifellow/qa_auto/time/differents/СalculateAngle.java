package ru.ifellow.qa_auto.time.differents;

public class СalculateAngle {


    public static double calculateAngle(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || hours > 12 || minutes > 60)
            System.out.println("Wrong input");

        if (hours == 12)
            hours = 0;
        if (minutes == 60) {
            minutes = 0;
            hours += 1;
            if(hours>12)
                hours = hours-12;
        }

        // Вычисляем угол, сделанный часовой стрелкой с нулевой позиции
        double hour_angle = 0.5 * (hours * 60 + minutes);

        // Вычисляем угол, сделанный минутной стрелкой с нулевой позиции
        double minute_angle = 6 * minutes;

        // Находим разницу двух углов
        double angle = Math.abs(hour_angle - minute_angle);

        // Возвращаем меньший угол из двух возможных
        angle = Math.min(360 - angle, angle);

        return angle;
    }
}
