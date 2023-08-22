package Models;

import Interfaces.EntryGateChangeObserver;
import Interfaces.EntryGateChoosingStrategy;

public class RoundRobinEntryGateChoosingStrategy implements EntryGateChoosingStrategy, EntryGateChangeObserver {
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

    @Override
    public void updateEntryGateCount(int entryGateCount) {
        this.totalGateCount = entryGateCount;
    }
}
