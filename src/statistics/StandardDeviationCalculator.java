package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class StandardDeviationCalculator {
    private StandardDeviationCalculator(){

    }

    public static Double calculateStandardDeviation(Double average, List<Double> data){
        List<Double> shiftedValues = new ArrayList<>();
        for(Double d: data){
            shiftedValues.add(Math.pow(d - average, 2));
        }
        double newMean = MeanCalculator.calculateMean(shiftedValues);
        return Math.sqrt(newMean);
    }
}
