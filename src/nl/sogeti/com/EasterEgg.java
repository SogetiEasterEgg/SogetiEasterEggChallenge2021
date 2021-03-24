package nl.sogeti.com;

import javax.swing.*;
import java.util.Random;

public class EasterEgg {

    private static final float EGG_EQUATION_SCALE_FACTOR = 1000;

    /**
     * Draws an easter egg through a modified ellipse equation: (x−a)²/rx² + (y−b)²/ry² = 1
     * <p>
     * Modified ellipse equation for vertical egg:
     * (x−centerXPoint)²*1000/(horizontalRadius² * (1+(0.025 * y))) + (y−centerYPoint)²*1000/verticalRadius² = 1000
     * x, y -> coordinates of a single point on ellipse
     *
     * @param eggMetrics - Metrics of the Egg
     */
    static void drawEgg(final EggMetrics eggMetrics) {
        for (int yCoordinate = 0; yCoordinate <= eggMetrics.getFrameHeight(); yCoordinate++) {
            drawSingleEggRow(eggMetrics, yCoordinate);
            System.out.println();
        }
    }

    private static void drawSingleEggRow(final EggMetrics eggMetrics, final int yCoordinate) {
        for (int xCoordinate = 0; xCoordinate <= eggMetrics.getFrameWidth(); xCoordinate++) {
            drawSingleEggPoint(eggMetrics, yCoordinate, xCoordinate);
        }
    }

    private static void drawSingleEggPoint(final EggMetrics eggMetrics, int yCoordinate, int xCoordinate) {
        if (isXYPointInsideEgg(eggMetrics, xCoordinate, yCoordinate)) {
            //TODO: stop hier je aanpassingen in
            //TODO: kinder surpise ei maken
            //TODO: Kinder is 30 karakters
            if (isRedWave(xCoordinate, yCoordinate)) {
                System.out.print(Colors.RED.getColor());
            } else if (isK(xCoordinate, yCoordinate)) {
                System.out.print(Colors.BLACK.getColor());
            } else if (isI(xCoordinate, yCoordinate) || isN(xCoordinate, yCoordinate) || isD(xCoordinate, yCoordinate) || isE(xCoordinate, yCoordinate) || isR(xCoordinate, yCoordinate)) {
                System.out.print(Colors.RED.getColor());
            } else {
                System.out.print(eggMetrics.getColor());
            }
        } else {
            System.out.print(eggMetrics.getBackgroundColor());
        }
    }

    private static boolean isRedWave(int xCoordinate, int yCoordinate) {
        return yCoordinate > 32 && yCoordinate < 45;
    }


    private static boolean isK(int xCoordinate, int yCoordinate) {
        if (xCoordinate == 26) {
            switch (yCoordinate) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 27 && yCoordinate == 12) {
            return true;
        } else if (xCoordinate == 28) {
            switch (yCoordinate) {
                case 11:
                case 13:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 29) {
            switch (yCoordinate) {
                case 10:
                case 14:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 30) {
            switch (yCoordinate) {
                case 9:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isI(int xCoordinate, int yCoordinate) {
        if (xCoordinate == 32) {
            switch (yCoordinate) {
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isN(int xCoordinate, int yCoordinate) {
        if (xCoordinate == 34 || xCoordinate == 38) {
            switch (yCoordinate) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 35 && yCoordinate == 12) {
            return true;
        } else if (xCoordinate == 36 && yCoordinate == 13) {
            return true;
        } else if (xCoordinate == 37 && yCoordinate == 14) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isD(int xCoordinate, int yCoordinate) {
        //x start = 40

        if (xCoordinate == 40) {
            switch (yCoordinate) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate >= 41 && xCoordinate <= 43) {
            switch (yCoordinate) {
                case 11:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 44) {
            switch (yCoordinate) {
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    private static boolean isE(int xCoordinate, int yCoordinate) {
        //x start = 42
        if (xCoordinate == 46) {
            switch (yCoordinate) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 47 || xCoordinate == 48) {
            switch (yCoordinate) {
                case 11:
                case 13:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 49){
            switch (yCoordinate) {
                case 11:
                case 15:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    private static boolean isR(int xCoordinate, int yCoordinate) {
        //x start = 51
        if (xCoordinate == 51){
            switch (yCoordinate) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate >= 52 && xCoordinate <= 54){
            switch (yCoordinate) {
                case 11:
                case 13:
                    return true;
                default:
                    return false;
            }
        } else if (xCoordinate == 55){
            switch (yCoordinate) {
                case 12:
                case 14:
                case 15:
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    private static boolean isXYPointInsideEgg(final EggMetrics eggMetrics, final int xCoordinate, final int yCoordinate) {
        return (((calculateSquareOfDistanceFromCenterXPoint(eggMetrics.getCenterXPoint(), xCoordinate) * EGG_EQUATION_SCALE_FACTOR) / (calculateSquareOfRadius(eggMetrics.getHorizontalRadius()) * factorToChangeToEggShape(yCoordinate))) +
                ((calculateSquareOfDistanceFromCenterYPoint(eggMetrics.getCenterYPoint(), yCoordinate) * EGG_EQUATION_SCALE_FACTOR) / calculateSquareOfRadius(eggMetrics.getVerticalRadius()))) < EGG_EQUATION_SCALE_FACTOR;
    }

    private static int calculateSquareOfDistanceFromCenterXPoint(final int centerXPoint, final int xCoordinate) {
        return calculateSquareOfDistanceFromCenterPoint(centerXPoint, xCoordinate);
    }

    private static int calculateSquareOfDistanceFromCenterYPoint(final int centerYPoint, final int yCoordinate) {
        return calculateSquareOfDistanceFromCenterPoint(centerYPoint, yCoordinate);
    }

    private static int calculateSquareOfDistanceFromCenterPoint(final int centerPoint, final int coordinate) {
        return (coordinate - centerPoint) * (coordinate - centerPoint);
    }

    private static double factorToChangeToEggShape(final int yCoordinate) {
        return 1 + (0.025 * yCoordinate);
    }

    private static int calculateSquareOfRadius(final int radius) {
        return radius * radius;
    }
}
