import java.util.Scanner;

public class Dzaky_soal_4 {
    public static void main(String[] args) {
        Scanner inputnilai = new Scanner(System.in);
        System.out.print("Input bilangan bulat positif: ");
        int nilai = inputnilai.nextInt();
        System.out.print("Faktorisasi dari bilangan " + nilai + " adalah ");
        for (int i = 2; i <= nilai; i++) {
            while (nilai % i == 0) {
                System.out.print(i + "x");
                nilai /= i;
            }
        }
    }
}
