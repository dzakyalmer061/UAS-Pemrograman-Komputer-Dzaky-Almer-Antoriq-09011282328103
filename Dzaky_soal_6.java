import java.util.Scanner;

public class Dzaky_soal_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata / frase : ");
        String word = input.nextLine();

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " adalah palindrom");
        } else {
            System.out.println(word + " bukan palindrom");
        }
    }
}