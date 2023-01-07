package ex2.ex2_1;

public abstract class MyAbstractList implements MyList{
    public MyAbstractList(){
    }
    void checkBoundaries(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    @Override
    public String toString(){
        String sb = "";
        for (int i=0; i<size(); i++){
            sb += get(i)  + " ";
        }
        return sb;
    }
}
