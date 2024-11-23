package design_patterns.singleton;

import java.util.HashMap;

public enum Enum implements Cache {

    INSTANCE;
    private HashMap<Object, Object> map;

    @Override
    public void put(Object key, Object value) {
        map.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }


}
