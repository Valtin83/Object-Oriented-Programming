public class Main {
    public static void main(String[] args) {
        // автомобиль
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        // грузовик
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        // велосипед
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        // мотоцикл
        MotorcycleSidecar bike = new MotorcycleSidecar("Bike1", 3);
        MotorcycleSidecar bike2 = new MotorcycleSidecar("Bike2", 2);

        // обслуживание
        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
        station.check(bike);
        station.check(bike2);
    }
}