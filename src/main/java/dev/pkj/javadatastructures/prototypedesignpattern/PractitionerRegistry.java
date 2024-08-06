package dev.pkj.javadatastructures.prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class PractitionerRegistry {
    private Map<String, Practitioner> map = new HashMap<>();

    public void register(String key, Practitioner practitioner) {
        map.put(key, practitioner);
    }

    public Practitioner get(String key) {
        return map.get(key);
    }
}
