package visitor.book;

public interface Book {
    abstract void accept(Visitor v);
}
