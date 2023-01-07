package ex1;

import java.util.*;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Lists.insertFirst(listA, 0);
        Lists.insertLast(listA, 6);
        System.out.println(listA);
        ArrayList<Integer> listB = new ArrayList<>();
        Lists.replace(listA, -2);
        System.out.println(listA);
        for (int i = 0; i < 1000; i++) {
            listB.add(i);
        }
        Lists.removeEvil(listB);
        Lists.removeThird(listB);
        System.out.println(listB);

        ArrayList<Integer> listC = Lists.generateSquare();
        System.out.println(listC);
        System.out.println(Lists.contains(listC, 123));
        ArrayList<Integer> listD = new ArrayList<>();
        Lists.copy(listC, listD);
        System.out.println(listD);
        Lists.reverse(listB);
        Lists.reverseManual(listD);
        System.out.println(listB);
        System.out.println(listD);
        LinkedList<Integer> listE = new LinkedList<>();
        for (Integer integer : listA) listE.add(integer);
        Lists.insertBeginningEnd(listE, -1);
        System.out.println(listE);
    }
}