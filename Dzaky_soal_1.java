import java.util.Scanner;

public class Dzaky_soal_1 {

    public static void main(String[] args) {
        // Input Jumlah barang
        Scanner input = new Scanner(System.in);
        System.out.println("Input Jumlah Barang yang ingin di beli : ");
        int Jumlah_barang = input.nextInt();
        // Input Harga BArang
        Scanner harga = new Scanner(System.in);
        System.out.println("Input Harga Barang : ");
        double Harga_barang = harga.nextDouble();

        // Penentuan diskon
        double diskon = 0;

        if (Jumlah_barang >= 5 && Jumlah_barang <= 10) {
            System.out.println("Selamat Anda Mendapatkan diskon sebesar 5%.");
            diskon = 0.05;
        } else if (Jumlah_barang >= 11 && Jumlah_barang <= 20) {
            System.out.println("Selamat Anda Mendapatkan diskon sebesar 10%.");
            diskon = 0.1;
        } else if (Jumlah_barang > 20) {
            System.out.println("Selamat Anda Mendapatkan diskon sebesar 20%");
            diskon = 0.2;
        }
        // Proses Hitung
        double firstbuy = Jumlah_barang * Harga_barang;
        double getdiskon = firstbuy * diskon;
        double finalbudget = firstbuy - getdiskon;

        // Menampilkan Output
        System.out.println("Harga Awal : " + firstbuy);
        System.out.println("Diskon Yang di dapat : " + getdiskon);
        System.out.println("Harga total " + finalbudget);
    }
}