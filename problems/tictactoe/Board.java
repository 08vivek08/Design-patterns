package problems.tictactoe;

import problems.tictactoe.winningstrategy.*;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private Cell[][] cells;
    List<WinningStrategy> strategies;
    public Board() {
        cells = new Cell[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                cells[i][j] = new Cell();
            }
        }

        strategies = new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagonalWinningStrategy());
    }

    public PieceType getPieceType(int x, int y) {
        return cells[x][y].getPieceType();
    }

    public boolean isEmptyCell(int x, int y) {
        return cells[x][y].isEmpty();
    }

    public void printBoard() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(!isEmptyCell(i, j)) {
                    System.out.print(cells[i][j].getPieceType() + " ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(isEmptyCell(i, j)) return false;
            }
        }

        return true;
    }

    public GameStatus checkGameStatus(PieceType pieceType) {
        for(WinningStrategy strategy:strategies) {
            if(strategy.checkWinner(this, pieceType)) {
                return pieceType.equals(PieceType.O) ? GameStatus.O_WIN : GameStatus.X_WIN;
            }
        }

        if(this.isBoardFull()) return GameStatus.DRAW;
        return GameStatus.IN_PROGRESS;
    }

    public GameStatus makeMove(Move move) {
        cells[move.getX()][move.getY()].setCell(move.getPieceType());
        return checkGameStatus(move.getPieceType());
    }
}
