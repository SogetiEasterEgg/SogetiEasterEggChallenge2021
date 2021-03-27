package nl.sogeti.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EggLine {

    private static final char BULLET = 0x2022;
    private static final char NON_BREAKING_SPACE = 0x00A0;
    private static final char SPACE = 0x20;

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final LocalDate easterDate;
    private final String text;
    private final int offset;
    private final String color;

    public EggLine(int year, String color) {
        this.offset = year % 30;
        this.easterDate = EasterUtils.getEasterDate(year);
        this.color = color;
        this.text = "    "
                + BULLET
                + NON_BREAKING_SPACE
                + easterDate.format(dateTimeFormatter)
                + NON_BREAKING_SPACE
                + BULLET
                + "            ";
    }

    public LocalDate getEasterDate() {
        return easterDate;
    }

    public String getCharacter(int position) {
        char charToPrint = this.text.charAt((this.offset + position) % this.text.length());
        if (charToPrint == SPACE) {
            return this.color + charToPrint;
        } else if (this.easterDate.getYear() == LocalDate.now().getYear()) {
            return EggColors.getHighliteColor() + charToPrint + EggColors.RESET;
        } else {
            return EggColors.getRibbonColor() + charToPrint + EggColors.RESET;
        }
    }
}
