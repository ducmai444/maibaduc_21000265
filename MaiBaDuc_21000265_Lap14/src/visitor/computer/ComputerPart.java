package visitor.computer;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
