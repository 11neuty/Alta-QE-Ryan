import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka bilangan yang akan anda faktorkan : ");

        int bilangan = scanner.nextInt();

        System.out.println("Faktor bilangan dari "+ bilangan + " adalah : ");
            for (int i = 1; i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    System.out.println(i);
                }
        }
    }
}
