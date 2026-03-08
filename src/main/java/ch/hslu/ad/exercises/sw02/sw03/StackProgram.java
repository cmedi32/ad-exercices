package ch.hslu.ad.exercises.sw02.sw03;

import ch.hslu.ad.exercises.sw02.ex02.ArrayStack;
import ch.hslu.ad.exercises.sw02.ex02.Stack;

public class StackProgram {
    // (2 + 3) * 4 = 20
    private static final String[] PROGRAM_1 = {
            "LOAD 2", "LOAD 3", "ADD", "LOAD 4", "MUL", "PRINT"
    };
    // 5 * (6 / (7 - 4)) = 10
    private static final String[] PROGRAM_2 = {
            "LOAD 5", "LOAD 6", "LOAD 7", "LOAD 4", "SUB", "DIV", "MUL", "PRINT"
    };
    protected Stack stack;
    protected String[] program = null;

    public StackProgram(String[] program) {
        this.program = program;
        this.stack = new ArrayStack(program.length);
    }

    static void main(String[] args) {
        StackProgram sp1 = new StackProgram(PROGRAM_1);
        sp1.execute();

        StackProgram sp2 = new StackProgram(PROGRAM_2);
        sp2.execute();
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
                case "SUB":
                    sub();
                    break;
                case "MUL":
                    mul();
                    break;
                case "DIV":
                    div();
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

    private void sub() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        stack.push(String.valueOf(b - a));
    }

    private void mul() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        stack.push(String.valueOf(a * b));
    }

    private void div() {
        int a = Integer.parseInt(stack.pop());
        int b = Integer.parseInt(stack.pop());
        stack.push(String.valueOf(b / a));
    }

    private void print() {
        System.out.println(stack.pop());
    }
}
