import java.util.Scanner;

public class Dzaky_soal_8 {
    private String username;
    private String password;
    private boolean isActive;

    public Dzaky_soal_8(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = false; // Awalnya, akun dianggap tidak aktif saat dibuat.
    }

    // Method untuk mengecek kebenaran username dan password
    public boolean checkCredentials(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Method untuk mengaktifkan akun
    public void activateAccount() {
        this.isActive = true;
        System.out.println("Akun " + username + " berhasil diaktifkan.");
    }

    // Method untuk menonaktifkan akun
    public void deactivateAccount() {
        this.isActive = false;
        System.out.println("Akun " + username + " berhasil dinonaktifkan.");
    }

    // Method untuk mendapatkan status akun
    public boolean isActive() {
        return isActive;
    }

    // Method untuk mendapatkan username
    public String getUsername() {
        return username;
    }

    // Method untuk mendapatkan password
    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh penggunaan
        Dzaky_soal_8 User1 = new Dzaky_soal_8("Dzaky", "1234567890");
        System.out.println("Username : " + User1.getUsername());

        // Meminta input username dan password dari pengguna
        System.out.print("Masukkan username : ");
        String inputUsername = scanner.next();

        System.out.print("Masukkan password : ");
        String inputPassword = scanner.next();

        // Memeriksa kebenaran username dan password
        if (User1.checkCredentials(inputUsername, inputPassword)) {
            System.out.println("Status Akun: " + (User1.isActive() ? "Aktif" : "Nonaktif"));

            // Pilihan untuk mengaktifkan atau menonaktifkan akun
            System.out.print("Pilih tindakan (1: Aktifkan, 2: Nonaktifkan): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                User1.activateAccount();
            } else if (choice == 2) {
                User1.deactivateAccount();
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            // Menampilkan status akun setelah tindakan
            System.out.println("Status Akun setelah tindakan: " + (User1.isActive() ? "Aktif" : "Nonaktif"));
        } else {
            System.out.println("Username atau password salah. Tidak dapat mengakses akun.");
        }
    }
}