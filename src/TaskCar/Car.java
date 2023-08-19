package TaskCar;

public class Car {


    private String model;
    private String mark;
    private Engine engine;
    private Lights lights;

    public Car(String model, String mark){
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(320, 400.0f, 2.5);
        this.lights = new Lights(500, 55.5f);
    }


    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public void turnOnCar() {
        System.out.println("Turning On Engine");
        this.engine.turnOn();
        System.out.println("Engine Is On");
    }

    public void turnOffCar() {
        this.engine.turnOff();
    }

    public boolean isEngineOn() {
        return this.engine.isEngineOn();
    }

    public void turnOnLights() {
        System.out.println("Turning On Lights");
        this.lights.turnOn();
        System.out.println("Lights Are On");
    }

    public void turnOffLights() {
        this.lights.turnOff();
    }

    public boolean isLightsOn() {
        return this.lights.isLightsOn();
    }
}
