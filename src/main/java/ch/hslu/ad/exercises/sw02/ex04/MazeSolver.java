package ch.hslu.ad.exercises.sw02.ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MazeSolver {

    private final char[][] maze;

    private int count;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
        this.count = 0;

        findPath(0, 0);

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        Path file = Path.of("src/main/java/ch/hslu/ad/exercises/sw02/ex04/largeMaze.txt");
        List<String> lines = Files.readAllLines(file);
        char[][] maze = new char[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            maze[i] = lines.get(i).toCharArray();
        }
        MazeSolver solver = new MazeSolver(maze);
    }

    /**
     * West > Ost > Nord > Süd
     */
    public void findPath(int row, int column) {
//        if (count >= 1) { // adjusted base case - terminates after elem has been foun
//            return;
//        }
        if (row < 0 || row >= maze.length || column < 0 || column >= maze[row].length) {
            return;
        }
        if (maze[row][column] == 'X') {
            printMaze();
            return;
        }
        if (maze[row][column] == ' ') { // boolean short circuit would be more performant - since the call stack is resolved instantly
            maze[row][column] = '.';
            findPath(row, column - 1); // West
            findPath(row, column + 1); // Ost
            findPath(row - 1, column); // Nord
            findPath(row + 1, column); // Süd
            maze[row][column] = ' ';
        }
    }

    private void printMaze() {
        count++;
        for (char[] chars : maze) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}