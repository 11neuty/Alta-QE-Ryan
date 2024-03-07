import  java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        //your code goes here
        Scanner jiji = new Scanner(System.in);
        int num = jiji.nextInt();
        int sum = 0;
        while(num > 0 ){
            sum += num--;
        }
        System.out.println(sum);


    }

}