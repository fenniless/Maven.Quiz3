package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(int i =0;i<word.length();i++){
            char z = word.charAt(i);
            if(z =='a' || z=='e' || z=='i' || z=='o' || z=='u' || z =='A' || z=='E' || z=='I' || z=='O' || z=='U'){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0 ; i<word.length(); i++){
            char z = word.charAt(i);
            if(z =='a' || z=='e' || z=='i' || z=='o' || z=='u' || z =='A' || z=='E' || z=='I' || z=='O' || z=='U'){
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        char z = word.charAt(0);

        if(z =='a' || z=='e' || z=='i' || z=='o' || z=='u' || z =='A' || z=='E' || z=='I' || z=='O' || z=='U'){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        char z = character;

        if(z =='a' || z=='e' || z=='i' || z=='o' || z=='u' || z =='A' || z=='E' || z=='I' || z=='O' || z=='U'){
            return true;
        }
        return null;
    }
}
