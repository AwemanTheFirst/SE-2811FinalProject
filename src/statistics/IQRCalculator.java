package statistics;

import java.util.List;

/**
 * This class is a static calculator that finds the interquartile range of a list of Double values.
 *
 * @author mahonbd
 * Created by mahonbd on 2/9/2017.
 */
public class IQRCalculator {
    /**
     * This constructor is made private to prevent instantiation.
     */
    private IQRCalculator(){
    }

    /**
     * Calculates the interquartile range of a list of double values.
     *
     * @param data The sorted data values
     * @return The interquartile range of the data
     */
    public static Double calculateIQR(List<Double> data){
        return UpperQuartileCalculator.calculateUpperQuartile(data) - LowerQuartileCalculator.calculateLowerQuartile(data);
    }
}
