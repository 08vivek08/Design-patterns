package problems.tictactoe;

public class Cell {
    private PieceType pieceType;

    public Cell() {
        pieceType = null;
    }

    public void setCell(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public boolean isEmpty() {
        return pieceType == null;
    }
}
