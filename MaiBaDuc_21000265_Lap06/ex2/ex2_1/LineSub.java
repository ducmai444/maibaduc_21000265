package ex2.ex2_1;

public class LineSub extends Point {
    Point end;

    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "begin("+getX()+","+getY()+"), end("+end.getX()+","+end.getY()+")";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(int beginX, int beginY) {
        setX(beginX);
        setY(beginY);
    }
    
    public void setBegin(Point point){
        setX(point.getX());
        setY(point.getY());
    }

    public void setEnd(int endX, int endY) {
        end.setX(endX);
        end.setY(endY);
    }

    public void setEnd(Point point){
        setX(point.getX());
        setY(point.getY());
    }

    public int getBeginX() {
        return getBeginX();
    }
    public int getBeginY() {
        return getBeginY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        setBeginX(beginX);
    }
    public void setBeginY(int beginY) {
        setBeginY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        setBeginX(beginX);
        setBeginY(beginY);
    }
    public void setEndX(int beginX) {
        end.setX(beginX);
    }
    public void setEndY(int beginY) {
        end.setY(beginY);
    }
    public void setEndXY(int beginX, int beginY) {
        end.setX(beginX);
        end.setY(beginY);
    }

    public int getLength() {
        int xDiff = getX() - end.getX();
        int yDiff = getY() - end.getY();
        return (int)Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = getX() - end.getX();
        int yDiff = getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }


}