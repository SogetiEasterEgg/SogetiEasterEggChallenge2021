package nl.sogeti.com;

import java.time.LocalDate;

public class EasterUtils {

    public static LocalDate getEasterDate(int year) {
            int century = year / 100;
            int n = year - 19 * (year / 19);
            int k = (century - 17) / 25;
            int i = century - century / 4 - (century - k) / 3 + 19 * n + 15;
            i = i - 30 * (i / 30);
            i = i - (i / 28) * (1 - (i / 28) * (29 / (i + 1)) * ((21 - n) / 11));
            int j = year + year / 4 + i + 2 - century + century / 4;
            j = j - 7 * (j / 7);
            int l = i - j;
            int m = 3 + (l + 40) / 44;
            int d = l + 28 - 31 * (m / 4);

            return LocalDate.of(year,  m, d);
    }
}
