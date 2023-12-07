import java.util.Scanner;

public class Dzaky_soal_5 {
    public static void main(String[] args) {
        Scanner inputnilai = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = inputnilai.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = inputnilai.nextDouble();

        System.out.print("Pilih operasi matematika yang ingin di jalankan (+, -, *, /): ");
        char operator = inputnilai.next().charAt(0);

        double hasil;

        // Memilih operasi yang ingin di jalankan
        switch (operator) {
            // Penjumlahan
            case '+':
                hasil = angka1 + angka2;
                break;
            // Pengurangan
            case '-':
                hasil = angka1 - angka2;
                break;
            // Perkalian
            case '*':
                hasil = angka1 * angka2;
                break;
            // Pembagian
            case '/':
                hasil = angka1 / angka2;
                break;

            default:
                System.out.printf("Operasi %c tidak dikenali.%n", operator);
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f%n", angka1, operator, angka2, hasil);
    }
}
