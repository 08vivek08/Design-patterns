package problems.tictactoe;

public class Move {
    private int x;
    private int y;
    private PieceType pieceType;

    public Move(int x, int y, PieceType pieceType) {
        this.x = x;
        this.y = y;
        this.pieceType = pieceType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
