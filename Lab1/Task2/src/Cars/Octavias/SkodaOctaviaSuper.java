package Cars.Octavias;

public class SkodaOctaviaSuper extends SkodaOctavia {

    protected SkodaOctaviaSuper(String name) {
        super(name);
    }

    public SkodaOctaviaSuper() {
        this("Skoda Octavia Super");
    }

    @Override
    protected void setMaxSpeed() {
        this.maxSpeed = 200;
    }

    @Override
    protected void setFuelConsumption() {
        this.fuelConsumption = 12;
    }

    @Override
    protected void setPrice() {
        this.price = 2_000_000;
    }

    @Override
    public void beep() {
        System.out.println("Skoda Octavia Super beeped");
    }
}
