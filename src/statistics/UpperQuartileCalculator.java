package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bendm_000 on 2/9/2017.
 */
public class UpperQuartileCalculator {
    private UpperQuartileCalculator(){
    }

    public static Double calculateUpperQuartile(List<Double> data){
        List<Double> upperData = data.subList(data.size() / 2, data.size());
        return MedianCalculator.calculateMedian(upperData);
    }
}
