package ex2.ex2_1;
public class Line {
    private Point begin;
    private Point end;

    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, endX);
        end = new Point(beginY, endY);
    }

    // Public methods
    public String toString() {
        return "begin("+begin.getX()+","+begin.getY()+"), end("+end.getX()+","+end.getY()+")";
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }
    public int getBeginY() {
        return this.begin.getY();
    }
    public int getEndX() {
        return this.end.getX();
    }
    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }
    public void setEndX(int beginX) {
        this.end.setX(beginX);
    }
    public void setEndY(int beginY) {
        this.end.setY(beginY);
    }
    public void setEndXY(int beginX, int beginY) {
        this.end.setX(beginX);
        this.end.setY(beginY);
    }
    public int getLength() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return (int)Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }

}