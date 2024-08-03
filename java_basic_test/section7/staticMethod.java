package java_basic_test.section7;

public class staticMethod {
    private static int count;
    private int value;

    public static void countPlus(){
        count++;
    }

    public static void staticCall(){
        count++;
    }

    public void call(){
        value++;
        count++;
    }
}
