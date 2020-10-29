 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String x : array){
            if (x == value){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int n = array.length;
        int j = n;
        String[] result = new String[n];
        for (int i = 0; i < n; i++){
            result[j-1] = array[i];
            j--;
        }
        
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0, j = array.length -1;
        while(i < j){
            if (array[i] != array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean[26];
        int index = 0;
      
        for (String str : array){
            for (int i = 0; i < str.length(); i++){
                if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                    index = str.charAt(i) - 'A';
                    mark[index] = true;
                }
                else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                    index = str.charAt(i) - 'a';
                    mark[index] = true;
                }
        }}
        for (boolean x : mark){
            if (!x){
                return false;
            }
        }
        
        return true;
}

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String x : array){
            if (x == value){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
        for (int i=0; i<array.length;i++){
            if (array[i] == valueToRemove){
                count++;
            }
        }
        String[] temp = new String[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != valueToRemove){
                temp[j++] = array[i];
            }
        }
        return temp;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = 0;
        for (int i=0; i<array.length-1;i++){
            if (array[i] == array[i+1]){
                count++;
            }
        } 
        String[] temp = new String[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++){
            String current = array[i];
            if (current != array[i+1]){
                temp[j++] = current;
            }
        }
        temp[j++] = array[array.length-1];
        return temp;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 0;
        for (int i=0; i<array.length-1;i++){
            if (array[i] == array[i+1]){
                count++;
            }
        } 
        String[] temp = new String[array.length - count];
        int j = 0;
        temp[0] = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] == array[i-1]){
                temp[j] += array[i];
            }
            else{
                temp[++j] = array[i];
            }
        }
                
        return temp;
    }


}
