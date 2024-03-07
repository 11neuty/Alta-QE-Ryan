import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");

        int nilaiMasuk = scanner.nextInt();

        System.out.println("Nilai mahasiswa anda adalah : ");

        if (nilaiMasuk >= 80 && nilaiMasuk <= 100) {
            System.out.println("A");
        } else if (nilaiMasuk >= 69 && nilaiMasuk <= 79) {
            System.out.println("B+");
        } else if (nilaiMasuk >= 50 && nilaiMasuk <= 64) {
            System.out.println("B");
        } else if (nilaiMasuk >= 35 && nilaiMasuk <= 49) {
            System.out.println("C");
        } else if (nilaiMasuk >= 0 && nilaiMasuk <= 34) {
            System.out.println("D");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
