package Bikes;

import Interfaces.Beepable;

public class Bike implements Beepable {
    @Override
    public void beep() {
        System.out.println("bike beeped");
    }
}
