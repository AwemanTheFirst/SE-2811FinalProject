package statistics;

import java.util.List;

/**
 * This class functions as a static calculator for the arithmetic mean of a list of Double values.
 *
 * @author weiserd
 * Created by weiserd on 2/9/2017.
 */
public class MeanCalculator {

    /**
     * This constructor is made private to prevent instantiation.
     */
    private MeanCalculator(){
    }

    /**
     * Calculates the mean for a list of double values. For performance's sake, this method does
     * assume that no values in the list are null.
     *
     * @param data The data values
     * @return The arithmetic mean of the data
     */
    public static Double calculateMean(List<Double> data){
        double sum = 0;
        for (Double d : data){
            sum += d;
        }
        sum /= data.size();
        return sum;
    }
}
