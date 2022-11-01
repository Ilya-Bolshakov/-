package Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ObjectNamesWorker {
    TreeMap<UUID, String> treeMap = new TreeMap<>();
    Collection<String> items;
    String path;
    public ObjectNamesWorker(String path) throws IOException {
        super();
        this.path = path;
        generateCollectionFromFile();
    }

    private void generateCollectionFromFile() throws IOException {
        this.items = new ArrayList<>();
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            items.add(scan.nextLine());
        }
        fr.close();
    }

    public ObjectNamesWorker(Collection<String> collection) {
        super();
        this.items = collection;
    }

    public TreeMap<UUID, String> getSortedMap() {
        return treeMap;
    }

    public TreeMap<UUID, String> generateSortedMap() {
        for (var item : items) {
            treeMap.put(UUID.randomUUID(), item);
        }
        return getSortedMap();
    }

    public TreeMap<UUID, String> squeezeMap() {
        var tempHashMap = new HashMap<String, UUID>();
        var entrySet = treeMap.entrySet();
        for (var item: entrySet) {
            tempHashMap.putIfAbsent(item.getValue(), item.getKey());
        }
        var resultEntrySet = tempHashMap.entrySet();
        var resultTreeMap = new TreeMap<UUID, String>();
        for (var item: resultEntrySet) {
            resultTreeMap.put(item.getValue(), item.getKey());
        }
        return resultTreeMap;
    }
}
