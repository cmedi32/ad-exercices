package ch.hslu.ad.exercises.sw02.sw03;

import ch.hslu.ad.exercises.sw02.ex02.ArrayStack;
import ch.hslu.ad.exercises.sw02.ex02.Stack;

public class StackProgram {
    protected Stack stack;

    protected String[] program = null;

    public StackProgram() {
        program = new String[6];

        program[0] = "LOAD 2";
        program[1] = "LOAD 3";
        program[2] = "ADD";
        program[3] = "LOAD 4";
        program[4] = "MUL";
        program[5] = "PRINT";

        stack = new ArrayStack(program.length);
    }

    // LOAD 2
    // LOAD 3
    // ADD
    // LOAD 4
    // MUL
    // PRINT
    static void main() {
        StackProgram sp = new StackProgram();
        sp.execute();
    }

    public void execute() {
        for (String instruction : program) {
            String[] parts = instruction.split(" ");
            String command = parts[0];
            int operand = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;

            switch (command) {
                case "LOAD":
                    load(operand);
                    break;
                case "ADD":
                    add();
                    break;
                case "MUL":
                    mul();
                    break;
                case "PRINT":
                    print();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown command: " + command);
            }
        }
    }

    private void load(int value) {
        stack.push(String.valueOf(value));
    }

    private void add() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        stack.push(String.valueOf(a + b));
    }

    private void mul() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        stack.push(String.valueOf(a * b));
    }

    private void print() {
        System.out.println(stack.pop());
    }
}
