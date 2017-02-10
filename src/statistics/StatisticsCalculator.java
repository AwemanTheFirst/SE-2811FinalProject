package statistics;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/**
 * Created by weiserd on 2/8/2017.
 */
public class StatisticsCalculator {
    private final List<Double> data;

    public StatisticsCalculator(String filename) throws FileNotFoundException {
        this(readListFile(filename));
    }

    public StatisticsCalculator(List<Double> data){
        Collections.sort(data);
        this.data = data;
    }

    public double getMean(){
        return MeanCalculator.calculateMean(data);
    }

    public double getMedian(){
        return MedianCalculator.calculateMedian(data);
    }

    public double getMax(){
        return 0.0;
    }

    public double getMin(){
        return 0.0;
    }

    public double getUpperQuartile(){
        return 0.0;
    }

    public double getLowerQuartile(){
        return 0.0;
    }

    public double getInterquartileRange(){
        return 0.0;
    }

    public double getRange(){
        return 0.0;
    }

    public List<Double> getMode(){
        return null;
    }

    public double getStandardDeviation(){
        return 0.0;
    }

    public static List<Double> readListFile(String filename) throws FileNotFoundException {
        //TODO Handle this exception properly
        //TODONE: Good enough
        ListFileReader reader = new ListFileReader(filename);
        return reader.readFile();
    }

    //etc

    //This should use possibly an external class for file reading and other external classes for all
    //of the necessary statistical functions. The goal is to exemplify the facade pattern.
}
