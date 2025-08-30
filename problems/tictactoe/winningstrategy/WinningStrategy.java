package problems.tictactoe.winningstrategy;

import problems.tictactoe.Board;
import problems.tictactoe.PieceType;

public interface WinningStrategy {
    public boolean checkWinner(Board board, PieceType pieceType);
}
