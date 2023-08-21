package Models;

public class RoundRobinEntryGateChoosingStrategy implements EntryGateChoosingStrategy{
    int totalGateCount;
    int turn;
    @Override
    public int getEntryGate() {
        turn = (turn+1)%totalGateCount;
        return turn;
    }

    RoundRobinEntryGateChoosingStrategy(int totalGateCount){
        this.totalGateCount = totalGateCount;
        turn = -1;
    }
}
