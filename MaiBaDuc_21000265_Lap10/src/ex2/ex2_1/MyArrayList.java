package ex2.ex2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o, int index) {
        if (size >= elements.length-1){
            enlarge();
        }
        try {
            checkBoundaries(index, size);
            for (int i = size; i> index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = o;
            size++;
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Can't add value by" + a);
        }
    }

    @Override
    public void remove(int index) {
//        List<Object> list = Arrays.asList(elements);
//        list.remove(index);
//        Object[] arr = list.toArray(new Object[0]);
        try {
            checkBoundaries(index,size-1);
            for (int i = index ; i<elements.length-1; i++) {
                elements[i] = elements[i + 1];
                size--;
            }
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Cant remove by" + a);
        }
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public Object get(int index) {
        try {
            checkBoundaries(index, size - 1);
        } catch (ArrayIndexOutOfBoundsException a) {
            return null;
        }
        return elements[index];
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    void enlarge() {
//        Object[] tmp = new Object[elements.length * 2];
//        System.arraycopy(elements, 0, tmp, 0, elements.length);
//        elements = tmp;
        elements = Arrays.copyOf(elements, elements.length*2);
    }
}
