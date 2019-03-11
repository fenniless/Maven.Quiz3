package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        return array[array.length-1];
    }

    public SomeType findEvenOccurringValue() {
        if(getNumberOfOccurrences(array[0])%2==0){
            return array[0];
        }
        return array[array.length-1];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            SomeType current = array[i];

            if (current == valueToEvaluate)
            {
                count++;
            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
