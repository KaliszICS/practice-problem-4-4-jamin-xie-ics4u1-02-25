public class CampbellClass {
    private CampbellClass() {}

    public static String convertString(int num) {
        return Integer.toString(num);
    }

    public static String convertString(double n) {
        return Double.toString(n);
    }

    public static String convertString(char c) {
        return Character.toString(c);
    }

    public static String convertString(boolean b) {
        return Boolean.toString(b);
    }

    public static int convertMetersToCenti(int m) {
        return m * 100;
    }

    public static double convertMetersToCenti(double mm) {
        return mm * 100;
    }

    public static String removeNonAlpha(String word) {
        word = word.replaceAll("[^a-zA-z]", "");
        return word;
    }

    public static String removeNonAlpha(String word, boolean b) {
        word = word.replaceAll("[^a-zA-z]", "");
        if (b) {
            return word.toUpperCase();
        }
        return word.toLowerCase();
    } 
}