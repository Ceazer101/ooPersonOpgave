package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Christopher", 25);

        String name = person.getName();
        System.out.println(name);

        System.out.println(person.getAge());

        System.out.println(person);

        person.hasBirthday();

        System.out.println("Tillykke med fødseldagen!!! "+ person);

        person.hasBirthday();

        System.out.println("Tillykke med fødseldagen!!! "+ person);
    }
}
