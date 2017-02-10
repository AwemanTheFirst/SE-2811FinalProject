package statistics;

import java.util.List;

/**
 * This class is a static calculator that finds the upper quartile of a list of Double values.
 *
 * @author mahonbd
 * Created by mahonbd on 2/9/2017.
 */
public class UpperQuartileCalculator {
    /**
     * This constructor is made private to prevent instantiation.
     */
    private UpperQuartileCalculator(){
    }
    /**
     * Calculates the upper quartile of a list of double values.
     *
     * @param data The sorted data values
     * @return The upper quartile of the data
     */
    public static Double calculateUpperQuartile(List<Double> data){
        List<Double> upperData = data.subList(data.size() / 2, data.size());
        return MedianCalculator.calculateMedian(upperData);
    }
}
