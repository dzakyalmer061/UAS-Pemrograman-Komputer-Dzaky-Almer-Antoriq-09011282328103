import java.util.Stack;

public class Dzaky_soal_9 {

    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(' || karakter == '{' || karakter == '[') {
                // Kurung buka, masukkan ke dalam stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                // Kurung tutup, periksa dengan kurung terakhir dalam stack
                if (stack.isEmpty() || !isPasanganKurung(stack.pop(), karakter)) {
                    return false; // Urutan kurung tidak benar
                }
            }
        }

        // Pastikan stack kosong setelah memeriksa seluruh ekspresi
        return stack.isEmpty();
    }

    private static boolean isPasanganKurung(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
                (buka == '{' && tutup == '}') ||
                (buka == '[' && tutup == ']');
    }

    public static void main(String[] args) {
        // Contoh penggunaan program
        String ekspresi1 = "((x + y) * z)"; // Urutan kurung benar
        String ekspresi2 = "({a + b) * c}"; // Urutan kurung salah

        System.out.println("Ekspresi 1: " + (cekUrutanKurung(ekspresi1) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 2: " + (cekUrutanKurung(ekspresi2) ? "Benar" : "Salah"));
    }
}
