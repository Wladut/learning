/* Speed converter udemy exercise */

public class SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371192);           // used for round a number
        }


    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0){
            System.out.println("Invalid value.");
        }
        else{
            System.out.println(kilometersPerHour +
                    " km/h = " +
                    toMilesPerHour(kilometersPerHour) +
                    " mi/h.");
        }
    }
}
