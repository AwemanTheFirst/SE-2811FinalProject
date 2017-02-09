package statistics;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by weiserd on 2/8/2017.
 */
public class StatisticsCalculator {
    private String filename;

    public StatisticsCalculator(String filename){
        this.filename = filename;
    }

    public double getMean(){
        return 0.0;
    }

    public double getMedian(){
        return 0.0;
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


    public List<Double> readListFile(){
        //TODO Handle this exception properly
        ListFileReader reader = null;
        try {
            reader = new ListFileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader.readFile();
    }

    //etc

    //This should use possibly an external class for file reading and other external classes for all
    //of the necessary statistical functions. The goal is to exemplify the facade pattern.
}
