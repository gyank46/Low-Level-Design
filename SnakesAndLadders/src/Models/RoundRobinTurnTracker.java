package Models;

import Interface.TurnTracker;

public class RoundRobinTurnTracker implements TurnTracker {
    int turn;
    int playersCount;

    public RoundRobinTurnTracker(int playersCount){
        this.turn = -1;
        this.playersCount = playersCount;
    }
    @Override
    public int getCurrentTurn() {
        turn = ((turn+1)%playersCount);
        return turn;
    }
}
