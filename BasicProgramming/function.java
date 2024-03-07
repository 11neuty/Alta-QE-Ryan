import javax.xml.namespace.QName;

public class function {
    public static void sayHello(String name, String waktu) {
        System.out.println("Halo, " + name + " Selamat " + waktu);
    }
    public static void main(String[] args) {
        sayHello("Ryan.", "Sore!");
        sayHello("Budi.", "Pagi!");
        sayHello("Andi", "Siang!");
    }
}
