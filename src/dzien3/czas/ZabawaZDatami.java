package dzien3.czas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ZabawaZDatami {
    public static void main(String[] args) {
        localTimePlayground();
        localDatePlayground();
        LocalDateTime dataZGodzina = LocalDateTime.now();
        System.out.println(dataZGodzina);
    }

    private static void localDatePlayground() {
        LocalDate dataAktualna = LocalDate.now();
        System.out.println(dataAktualna);
        String formattedDate = dataAktualna.getDayOfMonth() + "-" + dataAktualna.getMonth () + "-" + dataAktualna.getYear();
        System.out.println(formattedDate);
    }

    private static void localTimePlayground() {
        LocalTime localTime = LocalTime.now().withSecond(0).withNano(0);
        System.out.println(localTime);
        LocalTime twoHoursLater = localTime.plusHours(2);
        System.out.println(twoHoursLater);
        String formattedTime = twoHoursLater.getHour() + "." + twoHoursLater.getMinute() + "." + twoHoursLater.getSecond();
        System.out.println(formattedTime);

        //Obliczenie np. czasu wykonania jakiejs akcji w programie. Poniżej przykład wyliczenia różnicy czasu
        System.out.println("Różnica godzin: " + Duration.between(localTime, twoHoursLater));
    }
}
