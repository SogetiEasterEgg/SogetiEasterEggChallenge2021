package nl.sogeti.com;

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
            System.out.print(eggMetrics.getColor());
        } else {
            System.out.print(eggMetrics.getBackgroundColor());
        }
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
