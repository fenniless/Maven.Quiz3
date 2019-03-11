package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
//        Character.toUpperCase(str.charAt(indexToCapitalize));
//        str.indexOf(indexToCapitalize);
        String str2 = "";
        for(int i = 0 ; i <=str.length()-1; i++){
            if(i == indexToCapitalize){
                str2 = str2 + Character.toUpperCase(str.charAt(i));
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
        return str2;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean isIt = false;
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            isIt = true;
        }

        return isIt;
    }

    public static String[] getAllSubStrings(String string) {
        List list = new ArrayList<String>();

        for(int i = 0 ; i < string.length(); i++){
            int j = i;
            for(j = i+1; j <= string.length(); j++){
                list.add(string.substring(i,j));
            }
        }
        String[] newString = new String[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            newString[i] = list.get(i).toString();
        }
        return newString;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length-1;
    }
}
