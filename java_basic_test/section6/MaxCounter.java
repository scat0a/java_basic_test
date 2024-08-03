package java_basic_test.section6;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(isMaxValid(count,max)){
            System.out.println("count 값은 max 값보다 클수 없습니다");
            return;
        }
        count++;

    }

    private boolean isMaxValid(int count,int max){
        // count가 max보다 크면안됨
        return count >= max;
    }

    public int getCount() {
        return count;
    }
}
