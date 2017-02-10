package statistics;

import java.util.List;

/**
 * This class is a static calculator that finds the lower quartile of a list of Double values.
 *
 * @author mahonbd
 * Created by mahonbd on 2/9/2017.
 */
public class LowerQuartileCalculator {
    /**
     * This constructor is made private to prevent instantiation.
     */
    private LowerQuartileCalculator(){
    }

    /**
     * Calculates the lower quartile of a list of double values.
     *
     * @param data The sorted data values
     * @return The lower quartile of the data
     */
    public static Double calculateLowerQuartile(List<Double> data){
        List<Double> lowerData = data.subList(0, data.size() / 2);
        return MedianCalculator.calculateMedian(lowerData);
    }
}
