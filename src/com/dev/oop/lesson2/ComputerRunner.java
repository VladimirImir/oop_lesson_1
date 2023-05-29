package com.dev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        
        System.out.println("-------");
        computer.load();

        System.out.println("-------");
        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);

        System.out.println("-------");
        computer.printState();
    }
}
