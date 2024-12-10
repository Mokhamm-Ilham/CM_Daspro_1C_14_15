import java.util.Scanner;

public class CM_14_15 {
    static int[] stok = new int[10];
    static String[][] item = new String[10][2];
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
                
            } 
            
        } while (menu==4);
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
                System.out.print(item[i][0] + "\t");
            }
            System.out.print(stok[i] + "\n");
        }
    }


}