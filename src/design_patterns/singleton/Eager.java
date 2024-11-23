package design_patterns.singleton;

import java.util.HashMap;

public class Eager implements Cache {
    private static Eager instance = new Eager();

    private HashMap<Object, Object> map;

    private Eager() {
        map = new HashMap<>();
    }

    @Override
    public void put(Object key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static Eager getInstance() {
        return instance;
    }
}
