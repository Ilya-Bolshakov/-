import Cars.Octavias.SkodaOctavia;
import Cars.Octavias.SkodaOctaviaSuper;

public class Main {
    public static void main(String[] args) {
        TaxiStation station = new TaxiStation();
        station.addCar(new SkodaOctavia());
        station.addCar(new SkodaOctaviaSuper());
        station.addCar(new SkodaOctaviaSuper());

        System.out.print("Taxi station cost: ");
        System.out.println(station.countPriceTaxiStation());

        for (var item: station.getCars()) {
            item.beep();
        }


        System.out.println("Sorted taxi station");
        var sortedCars = station.sortTaxiStationToFuelConsumption();
        for (var item: sortedCars) {
            System.out.println(item);
        }

        var car = station.getCarBetweenSpeed(200, 202);
        System.out.print("car that speed between: ");
        System.out.println(car);
    }

}