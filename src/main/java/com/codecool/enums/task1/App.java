package com.codecool.enums.task1;

public class App {
    public static void main(String[] args) {
        WashMachine w = new WashMachine();
        w.startProgram(3, "black");
        w.startProgram(2, "mixed");
        w.startProgram(1, "red");
    }
}
