

public class Main {
    public static void main(String[] args) {
        House house = new House(6, 5);
        Window window = new Window(2,2);
        Door door = new Door(3,3);
        house.addDoor(door);
        house.addWindow(window);
        house.doorCount();
        house.windowCount();

        house.getDoors().get(2).closeToKey();
        house.getWindows().get(2).closeToKey();

        System.out.println(house.getDoors().get(2));
        System.out.println(house.getWindows().get(2));

        System.out.println(house);
    }
}