package org.example;

import java.util.LinkedList;

public class Class_LinkedList_ {
    public static void num (){
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //Добавляет новый элемент в конец списка.
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);
    }
    public static void main(String[] args) {
        num();

    }
}
