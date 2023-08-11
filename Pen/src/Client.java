import Models.*;
import Strategies.RefillInkRefillingStrategy;
import Strategies.ReplaceInkRefillingStrategy;
import Strategies.SmoothWritingStrategy;
import Strategies.StrokeWritingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Pen> penList = new ArrayList<>();
        penList.add(PenFactory.getPen("BALLPOINT"));
        penList.add(PenFactory.getPen("GEL"));
        penList.add(PenFactory.getPen("MARKER"));

        for(Pen pen:penList){
            pen.write();
            if(pen.isRefillable())
                pen.refill(pen);
        }


    }
}
