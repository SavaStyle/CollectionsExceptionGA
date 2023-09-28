package org.example.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsTest {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    TreeSet<Integer> treeSet = new TreeSet<>();
    HashSet<Integer> hashSet = new HashSet<>();


    public void init() {
        for (int i = 0; i < 9000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
            treeSet.add(i);
            hashSet.add(i);
        }
        System.out.println("В arrayList добавлено " + arrayList.size() + " элементов");
        System.out.println("В linkedList добавлено " + linkedList.size() + " элементов");
        System.out.println("В treeSet добавлено " + treeSet.size() + " элементов");
        System.out.println("В hashSet добавлено " + hashSet.size() + " элементов");
        setArrayList();
        setLinkedList();
        setTreeSet();
        setHashSet();
    }

    public void setArrayList() {
        System.out.println("\nАrrayList:");
        long average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();
            arrayList.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в конец arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();

            arrayList.add(i - 9000000, i);
            long finish = System.currentTimeMillis();

            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в начало arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();
            arrayList.add(i - 4500000, i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в середину arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            arrayList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в конце arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            arrayList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в начале arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            arrayList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в середине arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            arrayList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в конце arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            arrayList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в начале arrayList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            arrayList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в середине arrayList " + Math.round(average / 10) + " милисекунд");
    }

    public void setLinkedList() {
        System.out.println("\nLinkedList:");
        long average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();
            linkedList.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в конец linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();

            linkedList.add(i - 9000000, i);
            long finish = System.currentTimeMillis();

            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в начало linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 9000010; i < 9000020; i++) {
            long start = System.currentTimeMillis();
            linkedList.add(i - 4500000, i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в середину linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            linkedList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в конце linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            linkedList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в начале linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            linkedList.get(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в середине linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            linkedList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в конце linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            linkedList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в начале linkedList " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            linkedList.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в середине linkedList " + Math.round(average / 10) + " милисекунд");
    }

    public void setTreeSet() {
        System.out.println("\nTreeSet: ");
        long average = 0;

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            treeSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в конце treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            treeSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в начале treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            treeSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в середине treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            treeSet.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в конец treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            treeSet.add(i);
            long finish = System.currentTimeMillis();

            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в начало treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            treeSet.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в середину treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            treeSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в конце treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            treeSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в начале treeSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            treeSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в середине treeSet " + Math.round(average / 10) + " милисекунд");
    }

    public void setHashSet() {
        System.out.println("\nHashSet: ");
        long average = 0;

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            hashSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в конце hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            hashSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в начале hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            hashSet.remove(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время удаления элемена в середине hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            hashSet.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в конец hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            hashSet.add(i);
            long finish = System.currentTimeMillis();

            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в начало hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            hashSet.add(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время добавление элемена в середину hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 8999989; i < 9000000; i++) {
            long start = System.currentTimeMillis();
            hashSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в конце hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            hashSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в начале hashSet " + Math.round(average / 10) + " милисекунд");

        average = 0;
        for (int i = 5000000; i < 5000010; i++) {
            long start = System.currentTimeMillis();
            hashSet.contains(i);
            long finish = System.currentTimeMillis();
            average = average + (finish - start);
        }
        System.out.println("Среднее время поиска элемена в середине hashSet " + Math.round(average / 10) + " милисекунд");
    }
}
