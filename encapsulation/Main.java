public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Malibu", 2016);
        Car copiedCar = new Car("Ford", "Mustang", 2022);

        car.setYear(2024);

        copiedCar.copy(car);

        System.out.println(car);
        System.out.println(copiedCar);
    }
}