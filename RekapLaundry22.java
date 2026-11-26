import java.util.Scanner;
public class RekapLaundry22 {
    static Scanner sc = new Scanner(System.in);

    static void inputData(int[][] data, String[] layanan, String[] hari) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Berat " + layanan[i] + " hari " + hari[j] + " (kg): ");
                data[i][j] = sc.nextInt(); 
            }
        }
    }
    static void tampilTabel(int[][] data, String[] layanan, int[] harga, String[] hari) {
        System.out.printf("%-14s %-10s", "Layanan", "Harga/kg");
        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%-9s", hari[j]);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-14s Rp%-8d", layanan[i], harga[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-9d", data[i][j]);
            }
            System.out.println();
        }
    }
    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
            }
            static void tampilLayananTertinggi(int[][] data, String[] layanan) {
                int idxMax = 0;
                for (int i = 1; i < data.length; i++) {
                    if (totalPerLayanan(data, i) > totalPerLayanan(data, idxMax)) {
                        idxMax = i;
                    }
                }
                System.out.println("Layanan dengan total cucian tertinggi: " + layanan[idxMax] + " (" + totalPerLayanan(data, idxMax) + " kg)");
            }
            static int hariTersibuk(int[][] data) {
                int idxMax = 0;
                int totalMax = 0;
                for (int j = 0; j < data[0].length; j++) {
                    int totalHari = 0;
                    for (int i = 0; i < data.length; i++) {
                        totalHari += data[i][j];
                    }
                    if (totalHari > totalMax) {
                        totalMax = totalHari;
                        idxMax = j;
                    }
                }
                return idxMax;
            }

            static void tampilPendapatan(int[][] data, String[] layanan, int[] harga) {
                int totalSemua = 0;
                for (int i = 0; i < data.length; i++) {
                    int pendapatan = totalPerLayanan(data,i) * harga[i];
                    System.out.println(layanan[i] + ": Rp" + pendapatan);
                    totalSemua += pendapatan;
                }
                 System.out.println("Total pendapatan: Rp" + totalSemua);
            }
            public static void main(String[] args) {
    System.out.print("Jumlah layanan: ");
    int jmlLayanan = sc.nextInt();
    System.out.print("Jumlah hari: ");
    int jmlHari = sc.nextInt();
    sc.nextLine();

    String[] layanan = new String[jmlLayanan];
    int[] harga = new int[jmlLayanan];
    for (int i = 0; i < jmlLayanan; i++) {
        System.out.print("Nama layanan ke-" + (i + 1) + ": ");
        layanan[i] = sc.nextLine();
        System.out.print("Harga per kg " + layanan[i] + ": ");
        harga[i] = sc.nextInt();
        sc.nextLine();
    }

    String[] hari = new String[jmlHari];
    for (int j = 0; j < jmlHari; j++) {
        hari[j] = "Hari ke-" + (j + 1);
    }

    int[][] data = new int[jmlLayanan][jmlHari];
    inputData(data, layanan, hari);

    System.out.println("\n=== Rekap Cucian (kg) ===");
    tampilTabel(data, layanan, harga, hari);

    System.out.println();
    for (int i = 0; i < layanan.length; i++) {
        System.out.println("Total " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
    }

    System.out.println();
    tampilLayananTertinggi(data, layanan);

    int idxHari = hariTersibuk(data);
    System.out.println("Hari tersibuk: " + hari[idxHari]);

    System.out.println("\n=== Pendapatan ===");
    tampilPendapatan(data, layanan, harga);
}}

