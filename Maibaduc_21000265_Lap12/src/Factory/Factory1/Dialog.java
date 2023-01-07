package Factory.Factory1;

public abstract class Dialog {
    public abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
