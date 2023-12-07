public class Dzaky_soal_7 {
    // Atribut buku
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean sedangDipinjam;

    // Konstruktor untuk inisialisasi buku
    public Dzaky_soal_7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.sedangDipinjam = false;
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status Peminjaman : " + (sedangDipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!sedangDipinjam) {
            sedangDipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku sedang dipinjam.");
        }
        System.out.println();
    }

    // Metode untuk mengembalikan buku
    public void kembalikanBuku() {
        if (sedangDipinjam) {
            sedangDipinjam = false;
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Maaf, buku tidak sedang dipinjam.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Dzaky_soal_7 buku1 = new Dzaky_soal_7("Laskar Pelangi", "Andrea Hirata", 2005);
        Dzaky_soal_7 buku2 = new Dzaky_soal_7("Negeri 5 Menara", "Ahmad Fuadi", 2009);

        // Menampilkan informasi buku sebelum dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Mengembalikan buku
        buku1.kembalikanBuku();
        buku2.kembalikanBuku();

        // Menampilkan informasi buku setelah dikembalikan
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
    }
}
