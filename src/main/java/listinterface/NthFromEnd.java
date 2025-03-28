package listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Move the first pointer `n` steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                return "Invalid N"; // If N is greater than list size
            }
            first.next();
        }

        // Move both pointers until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // Second pointer now points to the Nth element from the end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println(findNthFromEnd(list, N));  // Output: D
    }
}
