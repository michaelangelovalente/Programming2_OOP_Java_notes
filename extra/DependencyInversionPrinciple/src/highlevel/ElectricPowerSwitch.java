package highlevel;

public class ElectricPowerSwitch implements Switch{

    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client){
        this.client = client;
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        if( isOn() ){
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }

    }
}