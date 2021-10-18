package javacourse.part2.lesson2;

public class ServiceStation {

    public void checkTyre(Transport transport) {
        if (transport != null) {
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        }
    }

    public void checkEngine() {
            System.out.println("Проверяем двигатель");
    }


    public void checkTrailer() {
            System.out.println("Проверяем прицеп");
    }
}

