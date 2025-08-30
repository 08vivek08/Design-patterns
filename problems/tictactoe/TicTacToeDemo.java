package problems.tictactoe;

import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {
        Player player1 = new Player("A");
        Player player2 = new Player("B");
        Game game = new Game(player1, player2);

        Scanner scanner = new Scanner(System.in);
        while (game.gameStatus()== GameStatus.IN_PROGRESS) {
            System.out.println("Player " + game.currentPlayer() + ": Please enter your id, x & y");
            int player_num = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Player player = player_num==1 ? player1 : player2;
            if(!game.playMove(x, y, player)) {
                System.out.println("Invalid Move, Try Again!!!");
            }

            game.printBoard();
            System.out.println("GameStatus " + game.gameStatus());
        }
    }
}
