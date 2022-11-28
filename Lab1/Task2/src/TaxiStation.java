import Cars.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiStation {
    private ArrayList<Car> cars;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public TaxiStation() {
        this.cars = new ArrayList();
    }

    public boolean addCar(Car car) {
        this.cars.add(car);
        return true;
    }

    public int countPriceTaxiStation() {
        return cars.stream().mapToInt(p -> p.getPrice()).sum();
    }

    public List<Car> sortTaxiStationToFuelConsumption() {
        return cars.stream().sorted(Comparator.comparing(c -> c.getFuelConsumption())).toList();
    }

    public Car getCarBetweenSpeed(int firstParamSpeed, int secondParamSpeed) {
        return cars.stream().filter(car -> car.getMaxSpeed() >= firstParamSpeed && car.getMaxSpeed() <= secondParamSpeed).findFirst().get();
    }


}
