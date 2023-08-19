package TaskCar;

public class Lights {

    private int lumenOutput;
    private float bulbPower;
    private boolean isOn;

    public Lights(int lumenOutput, float bulbPower){

        this.lumenOutput = lumenOutput;
        this.bulbPower = bulbPower;
    }

    public int getLumenOutput(){
        return this.lumenOutput;
    }

    public void setLumenOutput(int lumenOutput){
        this.lumenOutput = lumenOutput;
    }

    public float getBulbPower(){
        return this.bulbPower;
    }

    public void setBulbPower(float bulbPower){
        this.bulbPower = bulbPower;
    }

    public boolean isLightsOn(){
        return this.isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
}
