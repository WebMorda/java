package javacourse.part2.lesson2;

public class Bicycle extends Transport {
    private String modelName;
    private int wheelsCount;

    ServiceStation serviceStation = new ServiceStation();

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void check(){
        System.out.println("Обслуживаем " + modelName);
        serviceStation.checkTyre(this);
    }
}
