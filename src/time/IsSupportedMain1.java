package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();                    // 연/월/일 제공, 시간은 미제공

        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // UnsupportedTemporalTypeException 예외 발생
        System.out.println("minute = " + minute);
    }
}
