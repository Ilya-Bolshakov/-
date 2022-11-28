package Cars.Octavias;

import Cars.Car;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class SkodaOctavia extends Car {
    private FileInputStream fis;
    private Properties property;
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
        try {
            fis = new FileInputStream("src/resources/config.property");
            property = new Properties();
            property.load(fis);
            this.maxSpeed = Integer.parseInt(property.getProperty("car.skodaOctavia.maxSpeed"));
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
            this.fuelConsumption = Integer.parseInt(property.getProperty("car.skodaOctavia.fuelConsumption"));
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
            this.price = Integer.parseInt(property.getProperty("car.skodaOctavia.price"));
            fis.close();
        }
        catch (IOException e)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
