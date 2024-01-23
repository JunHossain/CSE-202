public class Equation {
    public void areaOfNonCircle(int sides, int radius) {
        int areaOfSquare = sides * sides;
        final double PI = 3.1416;
        double areaOfCircle = PI * (radius * radius);
        double restOfArea = areaOfSquare - areaOfCircle;
        if (restOfArea < 0) {
            System.out.println("The circle is bigger than the square.");
        } else {
            System.out.println("Equation: " + restOfArea);
        }
    }
}

/*
 *********
 *       *
 *   o   *
 *       *
 *********
 */
// I'm trying to find the non-circled area