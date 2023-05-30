package com.dev.oop.lesson2;

public class Computer {

    int ssd = 512;
    long ram = 1024;

    /** Коструктор по умолчанию. */
    Computer(){
        System.out.println("Я был создан!");
    }

    /** Конструктор с параметром. */
    Computer(int newSsd){
        ssd = newSsd;
    }

    /** Конструктор с параметрами. */
    Computer(int ssd, long newRam){
        /** this - решает проблему конфликта имен. */
        this.ssd = ssd;
        ram = newRam;
    }

    void load(){
        System.out.println("Я загрузился!");
    }
    void load(boolean open){
        System.out.println("Я загрузился!");
        if (open){
            System.out.println("Я открыл крышку!");
        }
    }

    void printState(){
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
