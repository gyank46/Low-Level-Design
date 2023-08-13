public class BotUser extends User{

    MoveMakingStrategy moveMakingStrategy;
    @Override
    public Cell makeMove(Board board) {
        return moveMakingStrategy.move(board);
    }

    public BotUser(MoveMakingStrategy moveMakingStrategy){
        this.moveMakingStrategy = moveMakingStrategy;
    }
}
