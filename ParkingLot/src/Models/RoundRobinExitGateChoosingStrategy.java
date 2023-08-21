package Models;

public class RoundRobinExitGateChoosingStrategy implements ExitGateChoosingStrategy{
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
}
