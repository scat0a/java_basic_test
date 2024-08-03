package java_basic_test.section7;

public class MathArrayUtils {
    private MathArrayUtils() {
    }
    
    public static int sum(int[] values){
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    public static double average(int[] values){
        double sum = sum(values);
        return sum / values.length;
    }

    public static int min(int[] values){
        int minvalue = values[0];
        for (int value : values) {
            if(value < minvalue) {
                minvalue = value;
            }
        }
        return minvalue;
    }

    public static int max(int[] values){
        int maxValue = values[0];
        for (int value : values) {
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
