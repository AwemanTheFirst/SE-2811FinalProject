package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class that handles calculating the standard deviation
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class StandardDeviationCalculator {
    private StandardDeviationCalculator(){

    }

    /**
     * This method calculated the standard deviation of a given list
     * @param average The average of the data
     * @param data    The data to be calculated from
     * @return        The standard deviation
     */
    public static Double calculateStandardDeviation(Double average, List<Double> data){
        List<Double> shiftedValues = new ArrayList<>();
        for(Double d: data){
            shiftedValues.add(Math.pow(d - average, 2));
        }
        double newMean = MeanCalculator.calculateMean(shiftedValues);
        return Math.sqrt(newMean);
    }
}
