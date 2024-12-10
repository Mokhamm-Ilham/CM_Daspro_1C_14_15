import java.util.Scanner;

public class CM_14_15 {
    static int[] stok = new int[0];
    static String[][] item = new String[0][2];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihMenu;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            pilihMenu = sc.nextInt();
            if (pilihMenu == 1) {
                tampilkanInventori();
                System.out.println();
            } else if (pilihMenu == 2) {
                tambahStok();
                System.out.println();
            } else if (pilihMenu == 3) {
                tambahItem();
                System.out.println();
            }
        } while (pilihMenu != 4);
    }

    static void menu() {
        System.out.println("===== MENU INVENTORI KAFE =====");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item Baru");
        System.out.println("4. Keluar");
    }

    static void tampilkanInventori() {
        System.out.println();
        System.out.println("===== DATA INVENTORI =====");
        System.out.printf("%-4s %-20s %-15s %-10s%n", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < item.length; i++) {
            System.out.printf("%-4d %-20s %-15s %-10d%n", (i + 1), item[i][0], item[i][1], stok[i]);
        }
    }

    static int tambahStok() {
        System.out.println();
        int no, tambahStok, hasil;
        System.out.println("===== TAMBAH STOK =====");
        do {
            System.out.print("Masukkan nomor Item: ");
            no = sc.nextInt();
            if (no <= 0 || no > item.length) {
                System.out.println("Item tidak ditemukan");
            }
        } while (no <= 0 || no > item.length);
        do {
            System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
            tambahStok = sc.nextInt();
            if (tambahStok <= 0) {
                System.out.println("Stok tidak boleh 0 atau negatif");
            }
        } while (tambahStok <= 0);
        hasil = stok[no - 1] += tambahStok;
        System.out.println("Stok " + item[no - 1][0] + " berhasil ditambah. Stok sekarang: " + hasil);
        return hasil;
    }

    static void tambahItem() {
        sc.nextLine();
        System.out.println("===== TAMBAH ITEM BARU =====");
        System.out.print("Masukkan nama item baru: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan kategori item baru: ");
        String kategori = sc.nextLine();
        int jumlahStok;
        do {
            System.out.print("Masukkan jumlah stok awal: ");
            jumlahStok = sc.nextInt();
            if (jumlahStok <= 0) {
                System.out.println("Stok tidak boleh 0 atau negatif");
            }
        } while (jumlahStok <= 0);

        String[][] itemBaru = new String[item.length + 1][2];
        int[] stokBaru = new int[stok.length + 1];

        for (int i = 0; i < item.length; i++) {
            itemBaru[i] = item[i];
            stokBaru[i] = stok[i];
        }

        itemBaru[item.length] = new String[]{nama, kategori};
        stokBaru[stok.length] = jumlahStok;

        item = itemBaru;
        stok = stokBaru;
        System.out.println("Item baru berhasil ditambahkan: " + item[item.length - 1][0] + " (" + item[item.length - 1][1] + ") - Stok: " + stok[stok.length - 1]);
    }
}
