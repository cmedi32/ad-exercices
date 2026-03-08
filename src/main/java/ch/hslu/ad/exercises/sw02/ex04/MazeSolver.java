package ch.hslu.ad.exercises.sw02.ex04;

public class MazeSolver {

    private char[][] maze;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
    }

    public static void main(String[] args) {
        char[][] mazeExample = {
                {' ', ' ', ' ', '#', '#', '#', '#', '#', '#', '#'},
                {' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
                {' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#'},
                {' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', '#'},
                {'#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#'},
                {'#', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', '#', '#', '#', '#', '#', '#', ' '},
                {' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'}};

        MazeSolver solver = new MazeSolver(mazeExample);

        // TODO
    }

    public void findPath(int a, int b) { // TODO: Bessere Parameternamen?
        // TODO
    }

    private void printMaze() {
        // TODO
    }
}