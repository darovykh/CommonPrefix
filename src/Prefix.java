import java.util.Arrays;

public class Prefix {

    public static String prefix(String[] array) {
        Arrays.sort(array);

        int end = Math.min(array[0].length(), array[array.length - 1].length());

        int i = 0;
        while (i < end && array[0].charAt(i) == array[array.length-1].charAt(i) ){
            i++;
        }

        String prefix = array[0].substring(0, i);
        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc

    }
}
