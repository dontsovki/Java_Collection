package org.example;

import java.util.ArrayList;

public class Class_ArrayList_ {
    public Class_ArrayList_(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static void num1()
    {
        ArrayList<Class_ArrayList_> cats = new ArrayList<Class_ArrayList_>(); //передаём значение в класс Class_ArrayList_
        cats.add(new Class_ArrayList_("Бегемот"));
        cats.add(new Class_ArrayList_("Тимофей"));

        System.out.println(cats);
    }
    public static void num2(){
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        System.out.println(planets);
    }
    public static void delIntFromList() {
        ArrayList myList= new ArrayList<String>();
        myList.add(1);
        myList.add("слово");
        myList.add(23);
        myList.add("абобус");
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) instanceof Integer) myList.remove(myList.get(i));
        }
        System.out.println(myList);
    }


    public static void main(String[] args) {
        num1();
        num2();
        delIntFromList();
    }



}


