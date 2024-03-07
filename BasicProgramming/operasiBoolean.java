public class operasiBoolean {
    public static void main(String[] args) {
        var nilaiAkhir = 80;
        var absen = 70;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);

    }
}
