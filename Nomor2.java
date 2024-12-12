
import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    private static final int[] HARGA_MENU = {35000, 45000, 20000, 15000};
    private static final String[] NAMA_MENU = {"Burger", "Steak", "Spaghetti", "Kentang"};
    private static ArrayList<Integer> KERANJANG_BELANJA = new ArrayList<>();

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String pilihan = ""; 
        do {
            System.out.print("Masukkan nama menu [Burger/Steak/Spaghetti/Kentang]:");
            String menuInput = inputScanner.nextLine().toLowerCase();

            int hargaItem = -1; 

            for (int i = 0; i < NAMA_MENU.length; i++) {
                if (menuInput.equals(NAMA_MENU[i].toLowerCase())) {
                    hargaItem = HARGA_MENU[i];
                    break;
                }
            }

            // Jika menu tidak valid
            if (hargaItem == -1) {
                System.out.println("Menu tidak tersedia.");
                continue; // Lanjutkan ke iterasi berikutnya
            }

            KERANJANG_BELANJA.add(hargaItem);

            System.out.print("Input lagi (Y/N)? ");
            pilihan = inputScanner.nextLine(); 
        } while (pilihan.equalsIgnoreCase("y")); 

        int totalBelanja = hitungTotalBelanja();
        double diskon = hitungDiskon(totalBelanja);
        double totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + KERANJANG_BELANJA.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);

        inputScanner.close();
    }

    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : KERANJANG_BELANJA) {
            total += harga;   
        }
        return total;     
    }

    public static double hitungDiskon(int total) {
        if (total < 50000) {
            return 0; // Tidak ada diskon
        } else if (total >= 50000 && total <= 100000) {
            return total * 0.05; // Diskon 5%
        } else {
            return total * 0.10; // Diskon 10%
        }
    }
}
