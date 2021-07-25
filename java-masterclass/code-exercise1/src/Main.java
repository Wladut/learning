public class Main {

    public static void main(String[] args) {
        SpeedConverter Speed;
        Speed = new SpeedConverter();

        System.out.println(Speed.toMilesPerHour(1.5));
        System.out.println(Speed.toMilesPerHour(10.25));
        System.out.println(Speed.toMilesPerHour(-5.6));
        System.out.println(Speed.toMilesPerHour(25.42));
        System.out.println(Speed.toMilesPerHour(75.114));


        Speed.printConversion(1.5);
        Speed.printConversion(10.25);
        Speed.printConversion(-5.6);
        Speed.printConversion(25.42);
        Speed.printConversion(75.114);

    }

}
