/* *****************************************************************************
 *  Name:              Andre Ramos
 *  Coursera User ID:
 *  Last modified:
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double r = 6371.0;
        

        double a = Math.pow(Math.sin((x2 - x1) / 2), 2)
                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);

        // great circle distance in radians
        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle2 = Math.toDegrees(angle2);

        //converting degree to km
        double km = (Math.PI / 180) * r;
        // each degree on a great circle of Earth is 111 kilometers
        double distance2 = km * angle2;


        System.out.println(distance2 + " kilometers");

    }
}
