package immutable;

import java.util.HashMap;
import java.util.Iterator;

public class Student1 {

    private final int id;
    private final String name;
    private final HashMap<String, String> map;


    public Student1(int id, String name, HashMap<String, String> hm) {
        this.id = id;
        this.name = name;
        HashMap<String, String> map = new HashMap<String, String>();
        Iterator<String> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            map.put(key, hm.get(key));
        }
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getMap() {
        return (HashMap<String, String>) map.clone();
    }
}
