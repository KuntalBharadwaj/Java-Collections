package listinterface;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++) {
            String input = sc.next();
            str[i] = input;
        }

        System.out.println(str);
        HashMap<String,Integer> map = new HashMap<>();

        for(String e: str) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);
    }
}
