package demo.string.format;

import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("The current weekday %1$tA year: %1$tY month: %1$tm ", now);
    }
}
