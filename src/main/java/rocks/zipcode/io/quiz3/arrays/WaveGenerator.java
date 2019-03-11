package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] strArray = new String[str.length()];
        String stringLower = str.toLowerCase();
        String stringUpper = str.toUpperCase();
        int indexToUppercase = 0;
        for(int i =0;i<str.length()-1;i++){

            for(int j = 0 ;j<str.length()-1;j++){
                strArray[j] = strArray[j]+stringLower.substring(i,j+1);
            }
            indexToUppercase++;
        }
        System.out.println(strArray.toString());
        return strArray;
    }
}
