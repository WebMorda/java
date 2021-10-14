package javacourse.part2.lesson2;

public class Truck extends Transport {
    private String modelName;
    private int wheelsCount;

    ServiceStation serviceStation = new ServiceStation();

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        serviceStation.checkTyre(this);
        serviceStation.checkEngine();
        serviceStation.checkTrailer();
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
