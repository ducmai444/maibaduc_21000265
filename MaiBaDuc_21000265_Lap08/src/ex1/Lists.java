package ex1;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size(), value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }
    public static void removeEvil(ArrayList<Integer> list) {
//        while(list.contains(666)){
//            list.remove(list.indexOf(666));
//        }
        list.removeIf(i -> i==666);
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=1; i<=10; i++){
            arrayList.add(i*i);
        }
        return arrayList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        boolean contain = false;
        if (list.contains(value)) contain = true;
        return contain;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        while (target.size() > 0) {
            target.remove(0);
        }
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i=0; i<list.size()/2; i++){
            int tmp = list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1, tmp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
