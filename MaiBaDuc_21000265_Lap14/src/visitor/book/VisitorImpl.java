package visitor.book;

public class VisitorImpl implements  Visitor{

    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business book");
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("DesignPattern book");
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("JavaCore book");
    }
}
