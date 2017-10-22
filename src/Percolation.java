public class Percolation {
    
    private int[][] grid;
    
    
    public Percolation(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        grid = new int[n][n];
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 0;
            }
        }

    }             
    public void open(int row, int col) {
        int arrayRow = row - 1;
        int arrayCol = col - 1;
        grid[arrayRow][arrayCol] = 1;
        
    }
    public boolean isOpen(int row, int col)  {
        int arrayRow = row - 1;
        int arrayCol = col -1;
        return grid[arrayRow][arrayCol] == 1;
    }
    public boolean isFull(int row, int col) {
        return true;
    }
    public int numberOfOpenSites() {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    total++;
                }
            }
        }
        return total;
    }
    
    public boolean percolates() {
        int rowNum = grid.length - 1;
        for (int i = 0; i < grid[rowNum].length; i++) {
            if (isFull(rowNum, i) == true) {
                return true;
            }
        }
        return false;
    }
//    public static void main(String[] args)   // test client (optional)

}
