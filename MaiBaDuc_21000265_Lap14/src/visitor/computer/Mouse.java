package visitor.computer;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
