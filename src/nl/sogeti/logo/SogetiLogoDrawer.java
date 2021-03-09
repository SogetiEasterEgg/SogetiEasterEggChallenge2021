package nl.sogeti.logo;

/**
 * This is just some very simple (ugly) code to print our Logo.
 *
 * NOTE: Please ignore this code.
 */
public class SogetiLogoDrawer {
    private static final String SOGETI_TEXT_COLOR = "\u001b[48;2;15;122;189m \u001b[0m";
    private static final String BACKGROUND_COLOR = "\u001b[48;2;254;254;254m \u001b[0m";
    private static final int SPADE_ICON_WIDTH = 13;

    private final int textWidth = 21;

    public void printSogetiLogo() {
        printSogetiText();
        printSpadeIcon();
    }

    private void printSogetiText() {
        for (int column = 0; column < textWidth; column++) {
            printEachRowForLetterS(column);
            printEachRowForLetterO(column);
            printEachRowForLetterG(column);
            printEachRowForLetterE(column);
            printEachRowForLetterT(column);
            printEachRowForLetterI(column);
            System.out.println();
        }
    }

    private void printSpadeIcon() {
        for (int column = 0; column < SPADE_ICON_WIDTH; column++) {
            SpadeIconDrawer.drawLogo(column);
            System.out.println();
        }
    }

    private void printEachRowForLetterS(final int column) {
        int j;
        for (j = 0; j < textWidth; j++) {
            if ((column == 3 ||
                column == 4 ||
                column == (textWidth - 1) / 2 ||
                column == ((textWidth - 1) / 2) - 1 ||
                column == (textWidth - 5) ||
                column == (textWidth - 6)) && j < textWidth - 2 && j > 2) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if (column <= (textWidth - 3) / 2 && column > 3 && (j == 3 || j == 4)) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if (column > (textWidth - 3) / 2 && column < textWidth - 4 && (j == textWidth - 3 || j == textWidth - 4)) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }

    private void printEachRowForLetterO(final int column) {
        int j, space = 2;
        for (j = 0; j <= textWidth - 1; j++) {
            if ((j == textWidth - space || j == textWidth - space - 1 || j == space || j == space + 1) && (column >= 3 && column <= textWidth - 5)) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if ((column == 3 || column == 4 || column == textWidth - 5 || column == textWidth - 6) && j > space && j < textWidth - space) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }

    private void printEachRowForLetterG(final int column) {
        int j, space = 2;
        for (j = 0; j <= textWidth - 1; j++) {
            if (((j == space || j == space + 1) && column >= 3 && column < textWidth - 5) ||
                ((j == textWidth - space || j == textWidth - space + 1) && column >= 3 && column < textWidth - 1)) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if ((column == 3 || column == 4 || column == textWidth - 5 || column == textWidth - 6 || column == textWidth - space || column == textWidth - 1) && j >= space) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }

    private void printEachRowForLetterE(final int column) {
        int j, space = 2;
        for (j = 0; j <= textWidth - 1; j++) {
            if (((j == space || j == space + 1) && column >= 3 && column < textWidth - 5) ||
                ((j == textWidth - space || j == textWidth - space + 1) && column >= 3 && column < textWidth - 7)) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if ((column == 3 || column == 4 || column == textWidth - 8 || column == textWidth - 9 || column == textWidth - 5 || column == textWidth - 6) &&
                j >= space &&
                j <= textWidth - space) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }

    private void printEachRowForLetterT(final int column) {
        int j;

        for (j = 0; j < textWidth - 9; j++) {
            if ((column == 3 || column == 4) && j > 2 && j < 8) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else if ((j == 3 || j == 2) && column > 0 && column < textWidth - 4) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }

    private void printEachRowForLetterI(final int column) {
        int size = textWidth - 5;
        int j;
        for (j = 0; j < 5; j++) {
            if ((j == 0 || j == 1) && column == 1) {
                System.out.print("\u001b[48;2;254;54;54m \u001b[0m");
            } else if ((j == 0 || j == 1) && column > 2 && column < size + 1) {
                System.out.print(SOGETI_TEXT_COLOR);
            } else {
                System.out.print(BACKGROUND_COLOR);
            }
        }
    }
}
