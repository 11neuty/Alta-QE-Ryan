import java.util.Scanner;

public class branching {
    public static void main(String[] args) {
//        if-else
        int batasNilai = 65;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputkan nilai kamu : ");
        String nilai = scanner.nextLine();
        int nilaiDalamInt = Integer.parseInt(nilai);


//        if (nilaiDalamInt > batasNilai){
//            System.out.println("Selamat, pinter!");
//        }
//        else{
//            System.out.println("Goblok Kamu");
//        }
        switch (nilaiDalamInt){
            case 80:
                System.out.println("Pinter kamu");
                break;
            case 70:
                System.out.println("pas pasan kamu");
                break;
            default:
                System.out.println("Kelas mana kamu goblok");
                break;
        }
    }
}
