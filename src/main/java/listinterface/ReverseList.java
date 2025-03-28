package listinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {

    static void reverseList(ArrayList<Integer> list) {
        int n = list.size();
        for(int i=0;i<n/2;i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }

    static void reverseLinklist(LinkedList<Integer> Linklist) {
        int n = Linklist.size();
        for(int i=0;i<n/2;i++) {
            Integer temp = Linklist.get(i);
            Linklist.set(i,Linklist.get(n-1-i));
            Linklist.set(Linklist.get(n-i-1),temp);
        }
    }


    public static void main(String strs[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        System.out.println();
        reverseList(list);
        System.out.println(list);
        System.out.println();

        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(5);
        linklist.add(4);
        linklist.add(3);
        linklist.add(2);
        linklist.add(1);
        System.out.println(linklist);
        System.out.println();
        reverseLinklist(linklist);
        System.out.println(linklist);
    }
}
