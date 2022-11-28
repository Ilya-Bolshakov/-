

public class Main {
    public static void main(String[] args) {
        House house = new House(6, 5);
        Window window = new Window(2,2);
        Door door = new Door(3,3);
        house.addDoor(door);
        house.addWindow(window);
        house.doorCount();
        house.windowCount();

        var sortedObjects = house.SortObjects();

        for (var item: sortedObjects) {
            System.out.println(item);
        }
    }
}