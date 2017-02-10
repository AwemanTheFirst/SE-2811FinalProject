package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * This class functions as a static calculator for the median of a list of Double values.
 *
 * @author weiserd
 * Created by weiserd on 2/9/2017.
 */
public class MedianCalculator {

    /**
     * This constructor is made private to prevent instantiation.
     */
    private MedianCalculator(){
    }

    /**
     * Calculates the mean for a list of double values. For performance's sake, this method does
     * assume that the list is already sorted and that no values in the list are null.
     *
     * @param data The sorted data values
     * @return The median of the data
     */
    public static Double calculateMedian(List<Double> data){
        if (data.size() % 2 == 0){
            List<Double> subData = new ArrayList<>(2);
            subData.add(data.get(data.size()/2-1));
            subData.add(data.get(data.size()/2));
            return MeanCalculator.calculateMean(subData);
        }
        return data.get(data.size() / 2);
    }
}
