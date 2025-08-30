package problems.tictactoe.winningstrategy;

import problems.tictactoe.Board;
import problems.tictactoe.PieceType;

public class RowWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, PieceType pieceType) {
        for(int i=0; i<3; i++) {
            boolean isEqual = true;
            for(int j=0; j<3; j++) {
                if(pieceType != board.getPieceType(i, j)) {
                    isEqual = false;
                    break;
                }
            }
            if(isEqual) return true;
        }
        return false;
    }
}
