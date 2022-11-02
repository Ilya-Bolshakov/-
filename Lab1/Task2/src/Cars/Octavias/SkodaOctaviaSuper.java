package Cars.Octavias;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SkodaOctaviaSuper extends SkodaOctavia {
    private FileInputStream fis;
    private Properties property;
    protected SkodaOctaviaSuper(String name) {
        super(name);
    }

    public SkodaOctaviaSuper() {
        this("Skoda Octavia Super");
    }

    @Override
    protected void setMaxSpeed() {
        try {
            fis = new FileInputStream("src/resources/config.property");
            property = new Properties();
            property.load(fis);
            this.maxSpeed = Integer.parseInt(property.getProperty("car.skodaOctaviaSuper.maxSpeed"));
            fis.close();
        }
        catch (IOException e)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

    @Override
    protected void setFuelConsumption() {
        try {
            fis = new FileInputStream("src/resources/config.property");
            property = new Properties();
            property.load(fis);
            this.fuelConsumption = Integer.parseInt(property.getProperty("car.skodaOctaviaSuper.fuelConsumption"));
            fis.close();
        }
        catch (IOException e)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

    @Override
    protected void setPrice() {
        try {
            fis = new FileInputStream("src/resources/config.property");
            property = new Properties();
            property.load(fis);
            this.price = Integer.parseInt(property.getProperty("car.skodaOctaviaSuper.price"));
            fis.close();
        }
        catch (IOException e)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

    @Override
    public void beep() {
        System.out.println("Skoda Octavia Super beeped");
    }
}
