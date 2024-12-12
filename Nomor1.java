import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int N = input.nextInt();
        
        // Memanggil prosedur untuk menampilkan angka ganjil
        tampilkanAngkaGanjil(N);

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }

    // Prosedur untuk menampilkan angka ganjil dari 0 hingga n
    public static void tampilkanAngkaGanjil(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
