public class PrimeNumber {
    private static boolean PrimeNumber(int number){
        if(number<2){
            return false;
        }
        for (int i=2; i*i<=number;i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber(11));
        System.out.println(PrimeNumber(13));
        System.out.println(PrimeNumber(17));
        System.out.println(PrimeNumber(28));
    }
}
