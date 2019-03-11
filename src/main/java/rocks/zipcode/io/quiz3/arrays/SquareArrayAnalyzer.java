package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        Arrays.sort(input);
        Arrays.sort(squaredValues);
        boolean isIt = true;
        for(int i =0 ; i < input.length ; i++){
            if(input[i]*input[i] != squaredValues[i]){
                isIt =  false;
            }
        }
        return isIt;
    }
}
