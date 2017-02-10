package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bendm_000 on 2/9/2017.
 */
public class LowerQuartileCalculator {
    private LowerQuartileCalculator(){
    }

    public static Double calculateLowerQuartile(List<Double> data){
        List<Double> lowerData = data.subList(0, data.size() / 2);
        return MedianCalculator.calculateMedian(lowerData);
    }
}
