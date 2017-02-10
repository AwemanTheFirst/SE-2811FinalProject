package statistics;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/**
 * Statistic calculating class following the facade pattern, created with the intention of using
 * a complex system of underlying classes. These classes need not be visible from the outside to
 * benefit from this class--this is the purpose of the facade.
 *
 * Created by weiserd on 2/8/2017.
 */
public class StatisticsCalculator {
    private final List<Double> data; // The data used by this instance

    /**
     * Creates a new instance given the filename of a file containing newline-delimited double
     * values.
     *
     * @author weiserd
     * @param filename The name of the file containing the data
     * @throws FileNotFoundException if the file could not be found
     */
    public StatisticsCalculator(String filename) throws FileNotFoundException {
        this(readListFile(filename));
    }

    /**
     * Creates a new instance given the list of data elements.
     *
     * @author weiserd
     * @param data The data for which to calculate statistics
     */
    public StatisticsCalculator(List<Double> data){
        if (data == null){
            throw new NullPointerException("List of data is null.");
        }
        for (Double d : data){
            if (d == null){
                throw new NullPointerException("At least one value in the list of data is null.");
            }
        }
        Collections.sort(data);
        this.data = data;
    }

    /**
     * Returns the arithmetic mean of the data in this instance.
     *
     * @author weiserd
     * @return The arithmetic mean of the data
     */
    public double getMean(){
        return MeanCalculator.calculateMean(data);
    }

    /**
     * Returns the median of the data in this instance.
     *
     * @author weiserd
     * @return The median of the data
     */
    public double getMedian(){
        return MedianCalculator.calculateMedian(data);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public double getMax(){
        return data.get(data.size()-1);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public double getMin(){
        return data.get(0);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public double getRange(){
        return getMax() - getMin();
    }

    public double getUpperQuartile(){
        return UpperQuartileCalculator.calculateUpperQuartile(data);
    }

    public double getLowerQuartile(){
        return LowerQuartileCalculator.calculateLowerQuartile(data);
    }

    public double getInterquartileRange(){
        return IQRCalculator.calculateIQR(data);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public List<Double> getMode(){
        return ModeCalculator.calculateMode(data);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public double getStandardDeviation(){
        return StandardDeviationCalculator.calculateStandardDeviation(getMean(), data);
    }

    /**
     * @author sullivan-bormannaj
     * @return
     */
    public static List<Double> readListFile(String filename) throws FileNotFoundException, IllegalArgumentException{
        ListFileReader reader = new ListFileReader(filename);
        return reader.readFile();
    }

    //etc

    //This should use possibly an external class for file reading and other external classes for all
    //of the necessary statistical functions. The goal is to exemplify the facade pattern.

}
