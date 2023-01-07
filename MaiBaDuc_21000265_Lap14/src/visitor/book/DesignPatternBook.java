package visitor.book;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "The publisher of DesignPattern book";
    }
    public String getBestSeller(){
        return null;
    }
}
