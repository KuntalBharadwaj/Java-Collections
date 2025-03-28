package setinterface;

import java.util.HashSet;

public class CheckEquality {
    static boolean checkSetEquality(HashSet<Integer> set1,HashSet<Integer> set2) {
        for(Integer val: set1) {
            if(!set2.contains(val)) return false;
        }

        for(Integer val: set2) {
            if(!set1.contains(val)) return false;
        }
        return true;
    }

    public static void main(String[] strs) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println(checkSetEquality(set,set2));
    }
}
