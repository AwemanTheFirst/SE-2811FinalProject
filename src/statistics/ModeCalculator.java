package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class ModeCalculator {
    private ModeCalculator() {
    }

    public static List<Double> calculateMode(List<Double> data){
        int maxOccurrences = -Integer.MAX_VALUE;
        int numberOfOccurrences = 0;
        double currentValue = data.get(0);
        double previousValue;
        List<Double> mode = new ArrayList<>();
        for(int i = 0; i < data.size(); i++){
            previousValue = currentValue;
            currentValue = data.get(i);
            if(previousValue == currentValue){
                numberOfOccurrences++;
            } else{
                numberOfOccurrences = 1;
            }
            if(numberOfOccurrences == maxOccurrences && !mode.contains(currentValue)){
                mode.add(currentValue);
                maxOccurrences = numberOfOccurrences;
            } else if(numberOfOccurrences > maxOccurrences){
                mode.clear();
                mode.add(currentValue);
                maxOccurrences = numberOfOccurrences;
            }
        }

        return mode;
    }
}
