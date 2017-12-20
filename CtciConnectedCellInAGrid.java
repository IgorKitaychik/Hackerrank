import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid/problem
    Problem: Print the number of cells in the largest region in the given matrix.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CtciConnectedCellInAGrid {

    static List<Integer> regions = new ArrayList<>();
    static List<String> adjacentRegions = new ArrayList<>();
    static Map<Integer, Integer> elementCount = new TreeMap<>();
    static int regionCounter = 2;

    public static void scanGrid(int[][] grid, int cols, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    //Add to regions
                    createRegion(grid, i, j, cols, rows);
                }
            }
        }

        //Scan around and find number not equal to itself and assign smaller number
        //This just constructs data structure for replacements and is replaced below
        //Ex 6 is replaced with 4 is added and 5 is replaced with 4 also added
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    //Add to regions
                    findAdjacentRegions(grid, i, j, cols, rows, grid[i][j]);
                }
            }
        }

        //Replace all numbers - where there is adjacent regions, should be the same #s
        //This requires a loop through the above data structure
        int small, large;
        for (String s : adjacentRegions) {
            small = Integer.parseInt(Character.toString(s.toCharArray()[0]));
            large = Integer.parseInt(Character.toString(s.toCharArray()[2]));
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] != 0 && grid[i][j] == large) {
                        grid[i][j] = small;
                    }
                }
            }
        }
        
        //Count elements for each region and add to treemap data structure
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    if (elementCount.isEmpty()) {
                        elementCount.put(grid[i][j], 1);
                    } else if (elementCount.get(grid[i][j]) != null) {
                        elementCount.put(grid[i][j], elementCount.get(grid[i][j])+1);
                    } else {
                        elementCount.put(grid[i][j], 1);
                    }
                }
            }
        }

        //Find key with max value
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        
        System.out.println(maxEntry.getValue());
    }

    public static void addAdjacentRegions(int compare, int current) {
        if (adjacentRegions.isEmpty()) {
            if (current < compare) {
                adjacentRegions.add(current + ":" + compare);
            } else {
                adjacentRegions.add(compare + ":" + current);
            }
        } else {
            String replaceEntry = "";
            boolean isAdd = false;
            for (String s : adjacentRegions) {
                if (s.equals(current + ":" + compare) || s.equals(compare + ":" + current)) {
                    isAdd = true;
                    break;
                }
            }
            if (!isAdd) {
                if (current < compare) {
                    replaceEntry = current + ":" + compare;
                } else {
                    replaceEntry = compare + ":" + current;
                }
                adjacentRegions.add(replaceEntry);
            }

        }
    }

    public static void findAdjacentRegions(int[][] grid, int i, int j, int cols, int rows, int n) {
        if (j > 0 && grid[i][j - 1] != 0 && grid[i][j - 1] != n) {
            addAdjacentRegions(grid[i][j - 1], n);
        } else if (j < cols - 1 && grid[i][j + 1] != 0 && grid[i][j + 1] != n) {
            addAdjacentRegions(grid[i][j + 1], n);
        } else if (i > 0 && i < rows - 1 && grid[i + 1][j] != 0 && grid[i + 1][j] != n) {
            addAdjacentRegions(grid[i + 1][j], n);
        } else if (i > 0 && grid[i - 1][j] != 0 && grid[i - 1][j] != n) {
            addAdjacentRegions(grid[i - 1][j], n);
        } else if (i > 0 && i < rows - 1 && j > 0 && j < cols - 1 && grid[i + 1][j + 1] != 0 && grid[i + 1][j + 1] != n) {
            addAdjacentRegions(grid[i + 1][j + 1], n);
        } else if (i > 0 && j > 0 && grid[i - 1][j - 1] != 0 && grid[i - 1][j - 1] != n) {
            addAdjacentRegions(grid[i - 1][j - 1], n);
        } else if (i > 0 && i < rows - 1 && j > 0 && grid[i + 1][j - 1] != 0 && grid[i + 1][j - 1] != n) {
            addAdjacentRegions(grid[i + 1][j - 1], n);
        } else if (i > 0 && j < cols - 1 && grid[i - 1][j + 1] != 0 && grid[i - 1][j + 1] != n) {
            addAdjacentRegions(grid[i - 1][j + 1], n);
        }
    }

    public static void printMarix(int[][] grid, int cols, int rows) {
        System.out.println();
        //print out new matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createRegion(int[][] grid, int i, int j, int cols, int rows) {
        if (regions.isEmpty()) {
            regions.add(regionCounter);
        } else {
            //Check surrounding cells and assign number
            regionCounter = checkAdjacentCells(grid, i, j, cols, rows);
            if (regionCounter == 0) {
                regionCounter = regions.get(regions.size() - 1) + 1;
                regions.add(regionCounter);
            }
            //else {
            //    regions.add(regionCounter);
            //}
        }
        grid[i][j] = regionCounter;
    }

    public static int checkAdjacentCells(int[][] grid, int i, int j, int cols, int rows) {
        int tempRegionCounter = 0;
        if (j > 0 && grid[i][j - 1] != 0 && grid[i][j - 1] != 1) {
            tempRegionCounter = grid[i][j - 1];
        } else if (j < cols - 1 && grid[i][j + 1] != 0 && grid[i][j + 1] != 1) {
            tempRegionCounter = grid[i][j + 1];
        } else if (i > 0 && i < rows - 1 && grid[i + 1][j] != 0 && grid[i + 1][j] != 1) {
            tempRegionCounter = grid[i + 1][j];
        } else if (i > 0 && grid[i - 1][j] != 0 && grid[i - 1][j] != 1) {
            tempRegionCounter = grid[i - 1][j];
        } else if (i > 0 && i < rows - 1 && j > 0 && j < cols - 1 && grid[i + 1][j + 1] != 0 && grid[i + 1][j + 1] != 1) {
            tempRegionCounter = grid[i + 1][j + 1];
        } else if (i > 0 && j > 0 && grid[i - 1][j - 1] != 0 && grid[i - 1][j - 1] != 1) {
            tempRegionCounter = grid[i - 1][j - 1];
        } else if (i > 0 && i < rows - 1 && j > 0 && grid[i + 1][j - 1] != 0 && grid[i + 1][j - 1] != 1) {
            tempRegionCounter = grid[i + 1][j - 1];
        } else if (i > 0 && j < cols - 1 && grid[i - 1][j + 1] != 0 && grid[i - 1][j + 1] != 1) {
            tempRegionCounter = grid[i - 1][j + 1];
        }
        return tempRegionCounter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            for (int grid_j = 0; grid_j < m; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        scanGrid(grid, m, n);
    }
}
