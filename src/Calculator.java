import java.util.Scanner;

/**
 * Program Kalkulator Sederhana untuk melakukan operasi matematika dasar
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator {

    /**
     * Metode utama untuk menjalankan program kalkulator.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak dapat membagi oleh nol.");
                    System.exit(1); // Keluar dari program dengan kode kesalahan
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                System.exit(1); // Keluar dari program dengan kode kesalahan
        }

        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

        input.close();
    }

}
