package nl.sogeti.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EggLine {

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final LocalDate easterDate;
    private final String text;
    private final int offset;
    private final String color;

    public EggLine(int year) {
        this.offset = year % 30;
        this.easterDate = EasterUtils.getEasterDate(year);
        int daySince21March = easterDate.getDayOfMonth() - 20 + ((easterDate.getMonth().getValue() - 3)* 31);
        this.color = EggColors.getColor(daySince21March);
        this.text = easterDate.format(dateTimeFormatter) + "                    ";
    }

    public LocalDate getEasterDate() {
        return easterDate;
    }

    public String getCharacter(int position) {
        return this.color + this.text.charAt((this.offset + position) % this.text.length());
    }
}
