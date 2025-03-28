package listinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateElement {

    static void reverse(ArrayList<Integer> list,int l, int k) {
        while(l<=k) {
            Integer temp = list.get(l);
            list.set(l,list.get(k));
            list.set(k,temp);
            l++;
            k--;
        }
    }

    static void rotateElement(ArrayList<Integer> list, int number) {
        reverse(list,0,number-1);
        reverse(list,number,list.size()-1);
        reverse(list,0,list.size()-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the Element of the ar+ray");
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the number to rotate the array");
        int number = sc.nextInt();
        System.out.println(list);
        rotateElement(list,number);
        System.out.println(list);
    }
}
