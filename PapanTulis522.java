import java.util.Scanner;
public class PapanTulis522 {
    static double luasLingkaran(double r) {
        double luas = Math.PI * r * r;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.print("Masukkan jari-jari: ");
        x = sc.nextDouble();
        double L = luasLingkaran(x);
        System.out.printf("Luas lingkaran = %.2f%n", L);
    }
}
