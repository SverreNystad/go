package go;

public class Piece {
    private int x;
    private int y;
    private int color;

    public Piece (int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
