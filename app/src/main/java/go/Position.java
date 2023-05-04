package go;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) throws IllegalArgumentException {
        validatePosition(x, y);
        this.x = x;
        this.y =y;
    }

    private void validatePosition(int x, int y) throws IllegalArgumentException {
        if (x < 0 || x > 18 || y < 0 || y > 18) {
            throw new IllegalArgumentException("Position out of bounds");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
