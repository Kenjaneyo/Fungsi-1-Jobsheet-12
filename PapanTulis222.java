import java.util.Scanner;
public class PapanTulis222 {
    static void luasLingkaran() {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Masukkan jari-jari: ");
        r = sc.nextDouble();
        double luas = Math.PI * r * r;
        System.out.printf("Luas lingkaran = %.2f%n", luas);
    }
    public static void main(String[] args) {
        luasLingkaran();
    }
}
