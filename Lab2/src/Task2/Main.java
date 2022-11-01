package Task2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        var path = "C:\\Users\\Ilya\\Desktop\\t.txt";

        var objectNamesWorker = new ObjectNamesWorker(path);
        var sortedMap = objectNamesWorker.generateSortedMap();
        var squeezeMap = objectNamesWorker.squeezeMap();
    }
}
