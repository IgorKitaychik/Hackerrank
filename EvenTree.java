import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/even-tree/problem
    Problem: Find the maximum number of edges you can remove from the tree to get a forest such that each connected component of the forest contains an even number of nodes.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class EvenTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertices = scan.nextInt();
        int edges = scan.nextInt();
        Map<Integer,Integer> tree = new LinkedHashMap<Integer,Integer>();
        for(int i=0; i<edges; i++) {
            tree.put(scan.nextInt(), scan.nextInt());
        }
        System.out.println(countEvenVertices(tree));
    }
    
    public static int countEvenVertices(Map<Integer,Integer> tree) {
        int count = 0;
        List<Integer> children = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> vertice : tree.entrySet()) {
            children.clear();
            children = countChildren(tree, vertice.getKey(), children);
            if(children.size() % 2 != 0)
                count++;
        }
        return count;
    }
    
    public static List<Integer> countChildren(Map<Integer,Integer> tree, int parentVertice, List<Integer> children) {
        for(Map.Entry<Integer,Integer> vertice : tree.entrySet()) {
            if (vertice.getValue() == parentVertice) {
                children.add(1);
                countChildren(tree, vertice.getKey(), children);
            }
        }
        return children;
    } 
}
