import java.util.Arrays;

/* Q1.1 Implement an algorithm to determine if a string has all unique characters.
 What if you cannot use additional data structures.
 [except Array, ArrayList, HashMAps, StringBuilders, Strings]
 */
public class IsUnique {
    public static void main(String[] args) {
        String STR= "Sharyu";
        System.out.println(CheckIsUnique(STR));

    }

    static boolean CheckIsUnique(String str){

        for (int i = 0; i < str.length() ; i++) {
            for (int j = i + 1; j < str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return  true;
    }
}
