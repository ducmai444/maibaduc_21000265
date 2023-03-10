package ex2.ex2_1;

public class MyLinkedList  extends  MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i=0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index ==0){
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index-1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        try {
            checkBoundaries(index, size-1);
            MyLinkedListNode current = getNodeByIndex(index-1);
            current.setNext(current.getNext().getNext());
            size--;
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Cant remove by " + a);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        try {
            checkBoundaries(index, size);
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Can not get value by " + a);
        }
        return getNodeByIndex(index);
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }
}
