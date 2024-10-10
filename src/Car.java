public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void refuelFuelTank() {
        System.out.println("Залить 98-й бензин");

    }

    @Override
    public void performMaintenance() {
        super.performMaintenance();
        checkEngine();
        refuelFuelTank();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}