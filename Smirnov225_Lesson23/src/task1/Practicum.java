package task1;

import java.time.Instant;

public class Practicum {
    static void main() {
        long millis = 9_000_000_000L;

        System.out.println(Instant.ofEpochMilli(millis));
        System.out.println(Instant.ofEpochMilli(-millis));
    }
}