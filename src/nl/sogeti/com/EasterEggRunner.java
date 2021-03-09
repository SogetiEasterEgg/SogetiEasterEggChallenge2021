package nl.sogeti.com;

import nl.sogeti.logo.SogetiLogoDrawer;

public class EasterEggRunner {

    public static void main(String[] args) {
        EasterEgg.drawEgg(createEggMetrics());

        // Please don't change the following code:
        new SogetiLogoDrawer().printSogetiLogo();
    }

    private static EggMetrics createEggMetrics() {
        return new EggMetrics(30, 22, 50, 20, Colors.WHITE.getColor(), Colors.GREEN.getColor());
    }
}
