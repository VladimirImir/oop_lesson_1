package com.dev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {

        /** Ctrl + Alt + V - создать переменную. */
        /** Ctrl + P - показать все перегрузки метода. */

        Computer computer = new Computer();
        computer.printState();

        Computer computer2 = new Computer(2048);
        computer2.printState();

        Computer computer3 = new Computer(4096, 4096);
        computer3.printState();
        
        computer3.load(true);

        /*System.out.println("-------");
        computer.load();
        
        System.out.println("-------");
        System.out.println("Ram: " + computer.ram);
        System.out.println("Ssd: " + computer.ssd);
        
        System.out.println("-------");
        computer.printState();*/
    }
}
