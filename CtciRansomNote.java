import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-ransom-note/problem
    Problem: Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CtciRansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        String[] m = magazine.split(" ");
        String[] n = note.split(" ");
        int c = 1;
        for (int i = 0; i < m.length; i++) {
            if (magazineMap.get(m[i]) == null) {
                magazineMap.put(m[i], 1);
            } else {
                c = (Integer)magazineMap.get(m[i]) + 1;
                magazineMap.put(m[i], c);
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (noteMap.get(n[i]) == null) {
                noteMap.put(n[i], 1);
            } else {
                c = (Integer)noteMap.get(n[i]) + 1;
                noteMap.put(n[i], c);
            }
        }
    }

    public boolean solve() {
        boolean isFound = true;
        Set setNote = noteMap.entrySet();
        Iterator iteratorNote = setNote.iterator();

        while (iteratorNote.hasNext()) {
            Map.Entry noteEntry = (Map.Entry) iteratorNote.next();
            if (magazineMap.get(noteEntry.getKey()) != null) {
                if (magazineMap.get(noteEntry.getKey()) == noteEntry.getValue() 
                        || (Integer)magazineMap.get(noteEntry.getKey()) > (Integer)noteEntry.getValue()) {
                    isFound = true;
                } else {
                    isFound = false;
                    break;
                }
            } else {
                isFound = false;
                break;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        //Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
