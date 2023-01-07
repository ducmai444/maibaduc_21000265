package ex2;

import java.util.*;

public class TestSets {
    public static void main(String[] args){
       Set<Integer> set1 = new HashSet<>(List.of(1,2,3));
       Set<Integer> set2 = new HashSet<>(List.of(5,2,3));
       System.out.println(Sets.intersectionManual(set1, set2));
       System.out.println(Sets.unionManual(set1, set2));
       System.out.println(Sets.intersection(set1, set2));
       System.out.println(Sets.union(set1, set2));
       System.out.println(Sets.toList(set1));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(Sets.removeDuplicates(list1));
        System.out.println(Sets.removeDuplicatesManual(list1));

        System.out.println(Sets.firstRecurringCharacter("albatrap"));
        System.out.println(Sets.allRecurringChars("allbatrap"));

        System.out.println(Sets.toArray(set1).getClass());

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet,2));
    }
}
