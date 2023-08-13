import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User player1 =  new Humanuser("Gyan","7002614683","sittuk46@gmail.com");
        player1.symbol = Symbols.X;

        MoveMakingStrategy moveMakingStrategy = new RandomMoveStrategy();
        User player2 = new BotUser(moveMakingStrategy);
        player2.symbol = Symbols.O;

        int boardSize = 4;
        List<User> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);

        GameOverStrategy gameOverStrategy =  new NormalGameOverStrategy();

        TicTacToe ticTacToe = new TicTacToe(boardSize,playerList,gameOverStrategy);

        int turns = 0;

        while(turns<boardSize*boardSize){
            User user = turns%2 == 0 ? player1:player2;
            if(user instanceof Humanuser){
                boolean validMove = false;
                while(!validMove){
                    System.out.println("Enter the row: ");
                    int row = scanner.nextInt();
                    System.out.println("Enter the column: ");
                    int column = scanner.nextInt();
                    validMove = ticTacToe.makeHumanMove(user,row,column);
                }
            }else if(user instanceof BotUser) {
                ticTacToe.makeBotMove(user);
            }
            if(ticTacToe.checkIfGameOver()){
                System.out.println("User: "+ user.symbol + "won the game");
                break;
            }
            turns++;
        }


    }

}
