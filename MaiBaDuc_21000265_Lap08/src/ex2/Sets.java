package ex2;
import java.time.temporal.ChronoField;
import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<Integer>();
        for (int i : first){
            for (int j : second){
                if (i!=j) {
                    result.add(i);
                }
            }
        }
        return result;
    }
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<Integer>();
        for (int i : first){
            result.add(i);
        }
        for (int i : second){
            result.add(i);
        }
        return result;
    }
    public static Set<Integer> intersection(Set<Integer> first,Set<Integer> second){
//        Set<Integer> result = Sets.intersection(first, second );
//        return Sets.intersection(first, second );
        Set<Integer> set1 = new HashSet<>(first);
        set1.retainAll(second);
        return set1;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }
    public static List<Integer> toList(Set<Integer> source){
//        List<Integer> list = new ArrayList<>(source);
        List<Integer> list = new ArrayList<>();
        list.addAll(source);
        return list;
    }
    public static List<Integer> removeDuplicates(List<Integer> source){
        Set<Integer> set = new HashSet<>(source);
        List<Integer> list = new ArrayList<>(set);
        return list;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source){
        for(int i=0; i<source.size(); i++){
            for (int j=i+1; j< source.size()-1; j++){
                if (source.get(i) == source.get(j)){
                    source.remove(source.get(i));
                }
            }
        }
        return source;
    }
    public static String firstRecurringCharacter(String s){
//        List<String> list1 = new ArrayList<String>(Arrays.asList(s.split("")));
//        int count = 0;
//        String output = "";
//        for (int i=0; i<list1.size(); i++){
//            for (int j=i; j<list1.size()-1; j++){
//                if (list1.get(i)==list1.get(j) && list1.get(i) != " "){
//                    count += 1;
//                }
//            }
//            if (count > 0) {
//                output = list1.get(i);
//                break;
//            }
//        }
//        return output;
        if (s==null || s.length()==0){
            return null;
        }
        Set<String> set = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            String res = s.charAt(i) +"";
            if (set.contains(res)){
                return res;
            }
            set.add(res);
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s){
//        List<String> list1 = new ArrayList<String>(Arrays.asList(s.split("")));
//        Set<Character> strSet = new HashSet<>();
//        int count = 0;
//        String output = "";
//        for (int i=0; i<list1.size(); i++){
//            for (int j=i; j<list1.size()-1; j++){
//                if (list1.get(i)==list1.get(j) && list1.get(i) != " "){
//                    count += 1;
//                }
//            }
//            if (count > 0) {
//                strSet.add(list1.get(i).charAt(0));
//            }
//        }
//        return strSet;
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (set.contains(c)){
                result.add(c);
            } else {
                set.add(c);
            }
        }
        return result;
    }
    public static Integer[] toArray(Set<Integer> source){
//        Integer[] output = new Integer[source.size()];
//        System.arraycopy(source.toArray(),0, output, 0,source.size());
//        return output;
        return source.toArray(new Integer[0]);
    }
    public static int getFirst(TreeSet<Integer> source){
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source){
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value){
        return source.higher(value);
    }
}
