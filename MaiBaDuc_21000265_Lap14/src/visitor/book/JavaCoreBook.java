package visitor.book;

public class JavaCoreBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "The publisher of JavaCore book";
    }
    public String getFavoriteBook(){
        return null;
    }
}
