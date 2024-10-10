public abstract class Vehicle implements Maintainable {
    private String modelName;
    private int wheelsCount;

    // конструктор
    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // выполнять техническое обслуживание
    @Override
    public void performMaintenance() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    // абстрактный метот: тип обновления
    public abstract void updateTyre();
}