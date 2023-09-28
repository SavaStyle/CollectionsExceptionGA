package org.example.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSwap {

    public Map<Integer, String> swap(HashMap<String, Integer> map) {
        System.out.println(map);
        Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(swapped);
        return swapped;
    }
}