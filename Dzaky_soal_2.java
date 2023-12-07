import java.util.Scanner;

public class Dzaky_soal_2 {
    public static void main(String[] args) {
        // Input data patokan
        String UserName = "Dzaky01";
        String password = "dzaky123";

        // Input data username dan password
        Scanner inputdata = new Scanner(System.in);

        System.out.println("User Name : ");
        String usernamedata = inputdata.nextLine();

        System.out.println("Kata Sandi : ");
        String passworddata = inputdata.nextLine();

        if (usernamedata.equals(UserName) && passworddata.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi gagal");
        }
    }
}
