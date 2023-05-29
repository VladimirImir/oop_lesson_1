package com.dev.oop.lesson2;

public class Computer {

    int ssd = 512;
    int ram = 1024;

    /** Коструктор по умолчанию. */
    Computer(){
        System.out.println("Я был создан!");
    }

    /** Конструктор с параметром. */
    Computer(int newSsd){
        ssd = newSsd;
    }

    /** Конструктор с параметрами. */
    Computer(int ssd, int newRam){
        /** this - решает проблему конфликта имен. */
        this.ssd = ssd;
        ram = newRam;
    }

    void load(){
        System.out.println("Я загрузился!");
    }

    void printState(){
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
