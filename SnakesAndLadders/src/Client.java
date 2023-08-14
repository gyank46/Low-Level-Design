public class Client {

    public static void main(String[] args) {
        Game game = Game.getGameBuilder()
                .setBoardSize(100)
                .addSpecialCell(21,5,CellType.SNAKE)
                .addSpecialCell(99,2,CellType.SNAKE)
                .addSpecialCell(41,22,CellType.SNAKE)
                .addSpecialCell(83,73,CellType.SNAKE)
                .addSpecialCell(48,82,CellType.LADDER)
                .addSpecialCell(9,36,CellType.LADDER)
                .addDiceWithFace(6)
                .addPlayer("Gyan","sittuk46@gmail.com","7002614683")
                .addPlayer("Aman","Amanroy843@gmail.com","7991122544")
                .addPlayer("Shomya","Shomya@gmail.com","7002614683")
                .addPlayer("Abhishek","abhishek@gmail.com","1234567890")
                .Build();

        while(!game.isGameOver()){
            game.play();
        }
    }
}
