package statistics;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * This class functions as a testing client that uses each method of the StatisticsCalculator.
 *
 * @author weiserd
 * Created by weiserd on 2/8/2017.
 */
public class StatisticsClient {
    public static final String NUMBER_FILE = "numbers.txt"; // The data file

    /**
     * Main method for testing.
     *
     * @param ignored ignored
     */
    public static void main(String[] ignored) {
        try {
            StatisticsCalculator calculator = new StatisticsCalculator(NUMBER_FILE);
            System.out.println("Mean: " + calculator.getMean());
            System.out.println("Standard Deviation: " + calculator.getStandardDeviation());
            System.out.println("Five Number Summary: " + calculator.getMin() + " " + calculator
                    .getLowerQuartile() + " " + calculator.getMedian() + " " + calculator
                    .getUpperQuartile() + " " + calculator.getMax());
            System.out.println("Median: " + calculator.getMedian());
            System.out.println("Interquartile Range: " + calculator.getInterquartileRange());
            System.out.println("Range: " + calculator.getRange());
            System.out.print("Mode: ");
            List<Double> mode = calculator.getMode();
            if (mode != null) {
                for (int i = 0; i < mode.size(); i++) {
                    System.out.print(mode.get(i));
                    if (i < mode.size() - 1) {
                        System.out.print(", ");
                    }
                }
            } else {
                System.out.println("null");
            }
        } catch (FileNotFoundException e){
            System.out.println("The desired file at \"" + NUMBER_FILE + "\" could not be found.");
        }
    }
}
