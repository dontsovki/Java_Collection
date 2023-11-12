package org.example;

import java.util.HashMap;
import java.util.Map;

public class Class_HashMap_ {
    public static void num() {
        Map<String, String> db = new HashMap<>();
        db.putIfAbsent("1", "один");
        db.put("2", "два");
        db.put(null, "!null");
        db.put(null, "chushka");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get("44"));
        //db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());
    }
    public static void num1() {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
    public static void num2() {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }



    public static void main(String[] args) {
        num();
        System.out.println("---------");
        num1();
        System.out.println("---------");
        num2();

    }
}
