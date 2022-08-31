import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class exo4 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        long years;
        long months;
        long days;
        long minutes;
        long seconds;

        System.out.println("Choissisez le nombre d'années");
        years = sc.nextLong() * 365;

        System.out.println("Choissisez le nombre de mois");
        months = sc.nextLong() * 31;

        System.out.println("Choissisez le nombre de jours");
        days = sc.nextLong();

        System.out.println("Choissisez le nombre de minutes");
        minutes = sc.nextLong();

        System.out.println("Choissisez le nombre de secondes");
        seconds = sc.nextLong();
        
        long secondsAYear = TimeUnit.SECONDS.convert(years, TimeUnit.DAYS);
        long secondsAMonth = TimeUnit.SECONDS.convert(months, TimeUnit.DAYS);
        long secondsADay = TimeUnit.SECONDS.convert(days, TimeUnit.DAYS);
        long secondsAMinute = TimeUnit.SECONDS.convert(minutes, TimeUnit.MINUTES);
        long totalSeconds = secondsAYear + secondsAMonth + secondsADay + secondsAMinute + seconds;

        System.out.println("Le totale de seconds est de: " + totalSeconds);
    }
}
