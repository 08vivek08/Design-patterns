package problems.tictactoe.winningstrategy;

import problems.tictactoe.Board;
import problems.tictactoe.PieceType;

public class DiagonalWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, PieceType pieceType) {
        boolean primaryDiagonal = true;
        for(int i=0; i<3; i++) {
            if(board.getPieceType(i,i) != pieceType) {
                primaryDiagonal = false;
                break;
            }
        }

        boolean secondaryDiagonal = true;
        for(int i=0; i<3; i++) {
            if(board.getPieceType(i, 3-i-1) != pieceType) {
                secondaryDiagonal = false;
                break;
            }
        }

        return primaryDiagonal || secondaryDiagonal;
    }
}
