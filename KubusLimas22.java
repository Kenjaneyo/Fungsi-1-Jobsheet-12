import java.util.Scanner;
public class KubusLimas22 {

    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }    
    static int volumeKubus(int sisi) {
        return  sisi * sisi * sisi;
    }
    static int luasPermukaanKubus(int sisi) {
        return 6 * luasPersegi(sisi);
    }
    static double volumeLimasPersegi(int sisi, int tinggi) {
        return luasPersegi(sisi) * tinggi/3.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\n==== MENU HITUNG BANGUN RUANG ====");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan sisi: ");
            int sisi = sc.nextInt();
            System.out.println("Luas Persegi = " + luasPersegi(sisi));
        } else if (pilihan == 2) {
            System.out.print("Masukkan sisi: ");
            int sisi = sc.nextInt();
            System.out.println("Volume Kubus = " + volumeKubus(sisi));
        } else if (pilihan == 3) {
            System.out.print("Maasukkan sisi: ");
            int sisi = sc.nextInt();
            System.out.println("Luas permukaan kubus = " + luasPermukaanKubus(sisi));
        } else if (pilihan == 4) {
            System.out.print("Masukkan sisi alas: ");
            int sisi = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            int tinggi = sc.nextInt();
            System.out.println("Volume Limas persegi = " + volumeLimasPersegi(sisi, tinggi));
        } else if (pilihan == 0) {
            System.out.println("Program selesai.");
        } else {
            System.out.println("Menu tidak tersedia");
        }
        }  while (pilihan != 0);

        sc.close();
    }
}
