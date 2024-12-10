import java.util.Scanner;

public class CM_14_15 {
    static int[] stok = new int[0];
    static String[][] item = new String[0][2];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk Item yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            if (menu == 1) {
                tampilkanInventori();
            } else if (menu == 2) {
                
            } else if (menu == 3) {
                tambahItem();
            } 
            
        } while (menu!=4);
    }

    static void tampilkanInventori() {
        System.out.println("===== DATA INVENTORI =====");
        System.out.println("No\tNama Item\tKategori\tStok");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < item.length; i++) {
            if (item[i][0] == null) {
                break;
            }
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < item[i].length; j++) {
                System.out.print(item[i][0] + " \t");
            }
            System.out.print(stok[i] + "\n");
        }
    }



    static void tambahItem() {
        System.out.println("===== TAMBAH ITEM BARU =====");
        System.out.print("Masukkan Nama Item: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kategori: ");
        String kategori = sc.nextLine();
        System.out.print("Masukkan Stok: ");
        int jumlahStok = sc.nextInt();
        sc.nextLine();
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
    }


}