package statistics;

import java.util.List;

/**
 * Created by weiserd on 2/9/2017.
 */
public class MeanCalculator {
    private MeanCalculator(){
    }

    public static Double calculateMean(List<Double> data){
        double sum = 0;
        for (Double d : data){
            sum += d;
        }
        sum /= data.size();
        return sum;
    }
}
