import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //inisialisasi
        Scanner scanner = new Scanner(System.in);
        //membaca dari terminal
        String inputTerminal = scanner.nextLine();
        //print
        System.out.print("Yang kamu masukkan adalah" +" " + inputTerminal);
    }
}
