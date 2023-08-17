package TaskCar;

public class Engine {

    private int hp;
    private float torque;
    private double capacity;
    private boolean isOn;

    public Engine(int hp, float torque, double capacity){
        this.hp = hp;
        this.torque = torque;
        this.capacity = capacity;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public float getTorque(){
        return this.torque;
    }

    public void setTorque(float torque){
        this.torque = torque;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }


}
