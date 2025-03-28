package listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> outputList = removeDuplicates(inputList);
        System.out.println(outputList);
    }
}
