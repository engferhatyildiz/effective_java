package design_patterns.singleton;

import java.util.HashMap;

public class Lazy implements Cache {
    private static Lazy instance;

    private HashMap<Object, Object> map;

    private Lazy() {
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
/*
    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

 */

    /**
     * Thread safe version!
     */
    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
