package statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bendm_000 on 2/9/2017.
 */
public class IQRCalculator {
    private IQRCalculator(){
    }

    public static Double calculateIQR(List<Double> data){
        return UpperQuartileCalculator.calculateUpperQuartile(data) - LowerQuartileCalculator.calculateLowerQuartile(data);
    }
}
