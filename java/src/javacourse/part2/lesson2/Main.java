package javacourse.part2.lesson2;

public class Main {
    public static void main(String[] args) {

        Transport car1 = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck1 = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);
        Transport bicycle1 = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] transports = {car1, car2, truck1, truck2, bicycle1, bicycle2};

        for (Transport transport : transports) {
            transport.check();
        }
    }
}
