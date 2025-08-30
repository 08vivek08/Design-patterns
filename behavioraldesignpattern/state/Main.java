package behavioraldesignpattern.state;

import behavioraldesignpattern.state.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Enter the input");
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != -1) {
            System.out.print("""
                    Enter a number:\s
                    1 to Play
                    2 to Stop
                    3 to Next
                    4 to Prev
                    any other number to exit \n""");
            number = scanner.nextInt();

            switch (number)
            {
                case 1:
                    System.out.println(player.getState().onPlay());
                    break;
                case 2:
                    System.out.println(player.getState().onLock());
                    break;
                case 3:
                    System.out.println(player.getState().onNext());
                    break;
                case 4:
                    System.out.println(player.getState().onPrevious());
                    break;
                default:
                    number = -1;
            }
        }
    }
}
