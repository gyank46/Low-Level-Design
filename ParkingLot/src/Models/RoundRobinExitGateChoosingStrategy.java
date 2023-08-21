package Models;

public class RoundRobinExitGateChoosingStrategy implements ExitGateChoosingStrategy,ExitGateChangeObserver{
    int totalGateCount;
    int turn;
    @Override
    public int getExitGate() {
        turn = (turn+1)%totalGateCount;
        return turn;
    }

    RoundRobinExitGateChoosingStrategy(int totalGateCount){
        this.totalGateCount = totalGateCount;
        turn = -1;
    }

    @Override
    public void updateEntryGateCounts(int gateCount) {
        this.totalGateCount = gateCount;
    }
}
