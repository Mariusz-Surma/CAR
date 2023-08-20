package TaskCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("passat", "vw");
        System.out.println(car.getModel());
        System.out.println(car.isEngineOn());
        car.turnOnCar();
        System.out.println(car.isEngineOn());
        System.out.println(car.isLightsOn());
        car.turnOnLights();
        System.out.println(car.isEngineOn());
        car.turnOnLights();
        System.out.println(car.);
    }
}
