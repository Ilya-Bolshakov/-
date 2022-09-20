package Cars.Octavias;

import Cars.Car;

public class SkodaOctavia extends Car {
    protected SkodaOctavia(String name) {
        super(name);
    }

    public SkodaOctavia() {
        this("Skoda Octavia");
    }

    @Override
    public void beep() {
        System.out.println("Skoda Octavia beeped");
    }

    @Override
    protected void setMaxSpeed() {
        this.maxSpeed = 160;
    }

    @Override
    protected void setFuelConsumption() {
        this.fuelConsumption = 10;
    }

    @Override
    protected void setPrice() {
        this.price = 1_200_000;
    }
}
