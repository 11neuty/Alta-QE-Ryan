public class Mean {
    public static void main(String[] args) {
        float[] numbers = {1,2,3,4};
        System.out.println(hitungMean(numbers));
    }

    public static float hitungMean(float[] numbers){
        int sum = 0;
        for (float number : numbers){
            sum += number;
        }
        return(float) sum/numbers.length;
    }
}
