package nl.sogeti.com;

/**
 * RGB colors can be used as shown below
 * "\u001b[38;2;R;G;Bm█"
 * <p>
 * \u001b  = this is the code for using the color palette
 * [38 = the number 38 is for coloring a character or icon,
 * ;2 = is used for the intensity of the color and
 * ;R;G;B = stand for RED, GREEN and BLUE with the range from 0 till 255
 * m stand for ending the line and █ stand for character or icon.
 * &&
 * "\u001b[48;2;R;G;Bm "
 * [48 = the number 48 is for coloring the background,
 * ;2 = is used for the intensity of the color and
 * ;R;G;B = stand for RED, GREEN and BLUE with the range from 0 till 255
 * m stand for ending the line and the space after stands for the background.
 * <p>
 * \u001b[0m = for resetting the color palette.
 * <p>
 * usefull links for using ansi color code :
 * https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
 * <p>
 * wikipedia link :
 * https://en.wikipedia.org/wiki/ANSI_escape_code
 */
public enum Colors {
    BLACK("\033[0;100m \u001b[0m"),
    RED("\033[0;101m \u001b[0m"),
    GREEN("\033[0;102m \u001b[0m"),
    YELLOW("\033[0;103m \u001b[0m"),
    BLUE("\033[0;104m \u001b[0m"),
    PURPLE("\033[0;105m \u001b[0m"),
    CYAN("\033[0;106m \u001b[0m"),
    WHITE("\033[0;107m \u001b[0m");

    private final String color;

    Colors(final String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}