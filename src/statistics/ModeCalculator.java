package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class that handles calculating the standard deviation
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class ModeCalculator {
    private ModeCalculator() {
    }

    /**
     * This method calculated the mode of a given list and returns the mode(s) in a list
     * @param data  The data to be calculated from
     * @return      The list of mode(s)
     */
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
