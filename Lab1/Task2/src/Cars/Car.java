package Cars;

import Interfaces.Beepable;

public abstract class Car implements Beepable {
    protected String name;
    protected int maxSpeed;
    protected int fuelConsumption;

    protected int price;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public Car(String name) {
        this.name = name;
        this.setMaxSpeed();
        this.setFuelConsumption();
        this.setPrice();
    }

    protected abstract void setMaxSpeed();

    protected abstract void setFuelConsumption();

    protected abstract void setPrice();

}
