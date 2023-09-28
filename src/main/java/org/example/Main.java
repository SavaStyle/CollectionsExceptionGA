package org.example;

import org.example.Collections.CollectionsTest;
import org.example.Collections.MapSwap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        CollectionsTest ct = new CollectionsTest();
        MapSwap ms = new MapSwap();
        HashMap<String, Integer> map = new HashMap<>();

        {
            map.put("q", 1);
            map.put("w", 2);
            map.put("e", 3);
            map.put("r", 4);
        }
        try {
            for (int i = 1; i < 100; i++) {
                if (list.size() >= 10) {
                    System.out.println(list);
                    throw new OwnException("Лимит превышен.\n");
                }
                list.add(i);
            }
        } catch (OwnException e) {
            System.out.println(e.getMessage());
        }

        // Запуск теста коллекций.
        //   ct.init();

        //разворот HashMap
        // ms.swap(map);
    }
}
