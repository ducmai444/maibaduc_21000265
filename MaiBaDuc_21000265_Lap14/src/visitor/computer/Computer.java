package visitor.computer;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{new Monitor(), new Keyboard(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(v);
        }
        v.visit(this);
    }
}
