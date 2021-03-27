package nl.sogeti.com;

import java.util.Arrays;
import java.util.List;

public class EggColors {

    public static final String RESET = "\033[0m";

    static final List<String> lineColors = Arrays.asList(
            "\033[48;5;231m",
            "\033[48;5;230m",
            "\033[48;5;229m",
            "\033[48;5;228m",
            "\033[48;5;221m",
            "\033[48;5;215m",
            "\033[48;5;208m",
            "\033[48;5;204m",
            "\033[48;5;202m",
            "\033[48;5;197m",
            "\033[48;5;196m"
            );

    static String getLineColor(float fraction) {
        int index = Math.round(fraction * (lineColors.size() -1));
        return lineColors.get(index);
    }

    public static String getRibbonColor() {
        return "\033[38;5;227;48;5;90m";
    }

    public static String getHighliteColor() {
        return "\033[1;3;38;5;11;48;5;162m";
    }
}
