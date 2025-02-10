package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();                    // 연/월/일 제공, 시간은 미제공

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);

        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }

    }
}
