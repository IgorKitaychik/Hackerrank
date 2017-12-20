import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem
    Problem: Given an matrix n X m, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class ConnectedCellsInAGrid {
    public static void main(String[] args) {
        //Read input
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        List<Integer> matrix = new ArrayList<>();
        int count = 1;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                int e = scan.nextInt();
                if (e == 1) {
                    matrix.add(count);
                }
                count++;
            }
        }
        int minDimension = row < col ? row : col;
        Map<Integer, List<Integer>> matrixMap = createRegions(matrix, col, col);
        matrixMap = mergeRegions(matrixMap, col, col);
        System.out.println(findLargestRegion(matrixMap));
    }

    static Map<Integer, List<Integer>> createRegions(List<Integer> matrix, int row, int col) {
        //Check if region should be created/updated
        Map<Integer, List<Integer>> matrixMap = new HashMap<>();
        int count = 1;
        for (Integer i : matrix) {
            if (matrixMap.size() == 0) {
                List<Integer> region = new ArrayList<>();
                region.add(i);
                matrixMap.put(count, region);
                count++;
            } else if (matrixMap.size() > 0) {
                if (!isAddToRegion(matrixMap, i, row, col)) {
                    List<Integer> region = new ArrayList<>();
                    region.add(i);
                    matrixMap.put(count, region);
                    count++;
                }
            }
        }
        return matrixMap;
    }

    static boolean isAddToRegion(Map<Integer, List<Integer>> matrixMap, int item, int width, int col) {
        //Check the difference between the last number for each region
        width += 1;
        for (Map.Entry<Integer, List<Integer>> e : matrixMap.entrySet()) {
            List<Integer> region = e.getValue();
            int last = region.get(region.size() - 1);
            if (item - width == last
                    || item - (width - 1) == last
                    || item - (width - 2) == last
                    || item - 1 == last
                    || item + 1 == last
                    || item + (width - 2) == last
                    || item + (width - 1) == last
                    || item + (width) == last) {
                if(!isBorderItem(item, last, col)) {
                    region.add(item);
                    return true;
                }
            }
        }
        return false;
    }

    static Map<Integer, List<Integer>> mergeRegions(Map<Integer, List<Integer>> matrixMap, int row, int col) {
        //Scan regions to determine if merge is required
        int size = matrixMap.size();
        for (int i = 1; i <= size; i++) {
            List<Integer> region = matrixMap.get(i);
            for (int j = 1; j <= size; j++) {
                if (i != j) {
                    List<Integer> regionCompared = matrixMap.get(j);
                    if (isMergeRegions(region, regionCompared, row, col)) {
                        //Merge regions and clean up
                        region.addAll(regionCompared);
                        matrixMap.remove(j);
                    }
                }
            }
        }
        return matrixMap;
    }

    static boolean isMergeRegions(List<Integer> region, List<Integer> regionCompared, int width, int col) {
        if(region == null || regionCompared == null)
            return false;
        width += 1;
        for (Integer i : region) {
            for (Integer j : regionCompared) {
                if (Math.abs(i - j) == 1
                        || Math.abs(i - j) == (width - 2)
                        || Math.abs(i - j) == (width - 1)
                        || Math.abs(i - j) == width) {
                    if(!isBorderItem(i, j, col)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static int findLargestRegion(Map<Integer, List<Integer>> matrixMap) {
        int size = matrixMap.size();
        int min = -1;
        for(Map.Entry<Integer, List<Integer>> e : matrixMap.entrySet()) {
            List<Integer> region = e.getValue();
            if (min < region.size()) {
                min = region.size();
            }
        }
        return min;
    }

    static boolean isBorderItem(int item, int compare, int size) {
        Set<Integer> borderItemsLeft = new HashSet<>();
        Set<Integer> borderItemsRight = new HashSet<>();
        int d = size * size;
        for (int i = 1; i <= d; i+=size) {
            borderItemsLeft.add(i);
            if(i!=1) {
                borderItemsRight.add(i-1);
            }
        }
        if((borderItemsLeft.contains(item) && borderItemsRight.contains(compare)) ||
                (borderItemsLeft.contains(compare) && borderItemsRight.contains(item))) {
            return true;
        }
        return false;
    }
}
