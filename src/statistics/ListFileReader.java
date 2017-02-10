package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class ListFileReader {
    private String fileName;
    private Scanner reader;

    public ListFileReader(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        reader = new Scanner(new File(fileName));
    }

    public List<Double> readFile() throws IllegalArgumentException{
        List<Double> numbers = new ArrayList<>();
        while(reader.hasNextDouble()){
            numbers.add(reader.nextDouble());
        }
        if(numbers.size() == 0 ){
            throw new IllegalArgumentException();
        }
        return numbers;
    }
}
