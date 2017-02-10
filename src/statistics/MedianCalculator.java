package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiserd on 2/9/2017.
 */
public class MedianCalculator {
    private MedianCalculator(){
    }

    public static Double calculateMedian(List<Double> data){
        if (data.size() % 2 == 0){
            List<Double> subData = new ArrayList<>(2);
            subData.add(data.get(data.size()/2-1));
            subData.add(data.get(data.size()/2));
            return MeanCalculator.calculateMean(subData);
        }
        return data.get(data.size() / 2);
    }
}
