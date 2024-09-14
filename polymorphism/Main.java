public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();

        Vehicle[] racers = {car, boat};

        for (Vehicle racer : racers) {
            racer.go();
        }
    }
}