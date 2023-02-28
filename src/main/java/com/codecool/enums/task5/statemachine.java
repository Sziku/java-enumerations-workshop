package com.codecool.enums.task5;

import java.util.Scanner;

public class statemachine {
    public static void main(String[] args) {
        enum State {
            INI, A, AA,AAA,B
        }

        boolean stop = true;
        State activeState = State.INI;
        String[] userInput = new String[1];
        while (stop) {
            Scanner scanner = new Scanner(System.in);
            switch (activeState) {
                case INI -> {
                    printState("State: START");
                    userInput[0]=scanner.nextLine();
                    if(userInput[0].equals("A")){
                        activeState = State.A;
                    } else if (userInput[0].equals("B")) {
                        activeState = State.B;
                    }
                }

                case A -> {
                    printState("State: A");
                    userInput[0]=scanner.nextLine();
                    if(userInput[0].equals("A")){
                        activeState = State.AA;
                    }
                }

                case AA -> {
                    printState("State: 2A");
                    userInput[0]=scanner.nextLine();
                    if(userInput[0].equals("A")){
                        activeState = State.AAA;
                    }
                }

                case AAA -> {
                    printState("State: 3A");
                    userInput[0]=scanner.nextLine();
                    if(userInput[0].equals("A")){
                        activeState = State.INI;
                    }else if (userInput[0].equals("B")) {
                        activeState = State.B;
                    }

                }

                case B -> {
                    printState("State: B");
                    stop=false;

                }

            }
        }
    }
    public static void printState(String state){
        System.out.println(state);
    }
}
