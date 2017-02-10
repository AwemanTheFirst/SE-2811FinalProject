package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is the class that handles reading the file
 * Created by sullivan-bormannaj on 2/9/2017.
 */
public class ListFileReader {
    private Scanner reader;

    public ListFileReader(String fileName) throws FileNotFoundException {
        reader = new Scanner(new File(fileName));
    }

    /**
     * This is the method that handles reading in the file specified by the path
     * @return                          The list containing the data from the file
     * @throws IllegalArgumentException If the list is empty
     */
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
