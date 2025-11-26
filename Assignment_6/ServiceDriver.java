interface Servicing {
    void getServiceTime();
}

class Car implements Servicing {
    public void getServiceTime() {
        System.out.println("\nCar service time: Every 6 months");
    }
}

class Bike implements Servicing {
    public void getServiceTime() {
        System.out.println("Bike service time: Every 3 months\n");
    }
}

public class ServiceDriver {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.getServiceTime();
        bike.getServiceTime();
    }
}
