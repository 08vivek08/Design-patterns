package problems.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.util.Collections.swap;

public class Game {
    private final List<Player> players;
    private final Board board;
    private Player currentPlayer;
    private final Stack<Move>history;
    private GameStatus status;

    public Game(Player player1, Player player2) {
        players = new ArrayList<>(2);
        players.add(player1);
        players.add(player2);

        if(Math.random() < 0.5) {
            swap(players, 0, 1);
        }

        players.getFirst().setPieceType(PieceType.O);
        players.getLast().setPieceType(PieceType.X);
        currentPlayer = players.getFirst();

        board = new Board();
        history = new Stack<>();
        status = GameStatus.IN_PROGRESS;
    }

    public void printBoard() {
        board.printBoard();
    }

    public boolean validateMove(int x, int y, Player player) {
        if(!currentPlayer.getUserName().equals(player.getUserName())) {
            System.out.println("INVALID MOVE: Current player is " + currentPlayer.getUserName());
            return false;
        }

        if(x<0 || x>=3 || y<0 || y>=3) {
            System.out.println("Invalid coordinates, it should be between 0 & 2");
            return false;
        }

        if(!board.isEmptyCell(x, y)) {
            System.out.println(x + ", "+ y + ": is not empty cell");
            return false;
        }

        return true;
    }

    public boolean playMove(int x, int y, Player player) {
        if(!this.validateMove(x, y, player)) return false;

        Move move = new Move(x, y, player.getPieceType());
        status = board.makeMove(move);
        history.push(move);

        if(players.getFirst().equals(currentPlayer)) currentPlayer = players.getLast();
        else currentPlayer = players.getFirst();

        return true;
    }

    public GameStatus gameStatus() {
        return status;
    }

    public String currentPlayer() {
        return currentPlayer.getUserName();
    }
}
