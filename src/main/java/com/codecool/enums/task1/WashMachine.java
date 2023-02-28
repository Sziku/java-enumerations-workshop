package com.codecool.enums.task1;

public class WashMachine {
    public void startProgram(int level, String color) {
        String levelString = switch (level) {
            case 1 -> "low";
            case 2 -> "medium";
            case 3 -> "high";
            default -> throw new RuntimeException("Invalid heat level");
        };
        System.out.printf("Running %2$s color program on heat level: %1$s%n", levelString, color);
    }
}
