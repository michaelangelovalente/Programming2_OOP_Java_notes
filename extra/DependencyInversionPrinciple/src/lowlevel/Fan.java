package lowlevel;

import highlevel.Switchable;

public class Fan implements Switchable {



    public void turnOn(){
        System.out.println("Fan: fan turned on...");
    }

    public void turnOff(){
        System.out.println("Fan: fan turned off...");
    }
}
