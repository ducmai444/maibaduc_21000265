package visitor.computer;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
