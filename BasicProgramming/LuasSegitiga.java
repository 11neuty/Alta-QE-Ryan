import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LuasSegitiga {
    public static void main(String[] args) throws IOException {
        int Alas, Tinggi, Luas;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Masukkan angka Alas :");
        Alas = Integer.parseInt(br.readLine());
        System.out.println("Masukkan angka Tinggi");
        Tinggi = Integer.parseInt(br.readLine());

        Luas = Alas * Tinggi / 2;
        System.out.println("Nilai Luas segitiga adalah " + Luas);
    }
}
