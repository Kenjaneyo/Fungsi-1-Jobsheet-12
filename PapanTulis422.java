import java.util.Scanner;
public class PapanTulis422 {
    static double luasLingkaran() {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Masukkan jari-jari: ");
        r = sc.nextDouble();
        double luas = Math.PI * r * r;
        return luas;
    }

    public static void main(String[] args) {
        double L = luasLingkaran();
        System.out.printf("Luas lingkaran = %.2f%n", L);
    }
}
