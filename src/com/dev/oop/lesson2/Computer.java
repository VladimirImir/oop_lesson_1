package com.dev.oop.lesson2;

public class Computer {

    private int ssd = 512;
    private long ram = 1024;

    /** Конструктор с параметром. */
    Computer(int newSsd){
        ssd = newSsd;
        ram = 128;
    }

    /** Конструктор с параметрами. */
    protected Computer(int ssd, long newRam){
        /** this - решает проблему конфликта имен. */
        this.ssd = ssd;
        ram = newRam;
    }

    /** Коструктор по умолчанию. */
    public Computer(){
        System.out.println("Я был создан!");
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
