import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin: ");
        int n = scanner.nextInt();
        scanner.close();

        // Üst kısmı çizdiren for döngüsü
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Boşlukları yazdırıyoruz
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Yıldızları yazdırıyoruz
            }
            System.out.println();
        }

        // Alt kısmı çizdiren for döngüsü
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Boşlukları yazdırıyoruz
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Yıldızları yazdırıyoruz
            }
            System.out.println();
        }
    }
}
