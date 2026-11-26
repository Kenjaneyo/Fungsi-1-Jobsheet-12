import java.util.Scanner;
public static void Menu(String namaPelanggan, boolean isMember) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
}



public static int hitungTotalHarga22(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu("Andi", true);

    System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();

    int totalBayar = hitungTotalHarga22(pilihanMenu, banyakItem);

    System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
}

