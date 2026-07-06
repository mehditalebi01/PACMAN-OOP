package GAME;

import java.util.ArrayList;
import java.util.List;

public final class Grid<T> {
    private final List<List<T>> grid;
    private final int rows;
    private final int cols;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            grid.add(new ArrayList<>(cols));
            for (int j = 0; j < cols; j++) {
                grid.get(i).add(null); 
            }
        }
    }

    public void setCell(int row, int col, T item) {
        if (isValid(row, col)) {
            grid.get(row).set(col, item);
        } else {
            System.err.println("Error: Grid indices out of bounds for setCell (" + row + ", " + col + ")");
        }
    }


    public T getCell(int row, int col) {
        if (isValid(row, col)) {
            return grid.get(row).get(col);
        }
        return null;
    }


    public boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

}