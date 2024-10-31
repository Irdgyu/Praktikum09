import java.util.Scanner;
public class Tugas306 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean temukan = false;
        String cariMenu;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("=== Daftar Menu ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        do {
            System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
            cariMenu = input.nextLine();
            for (String makanan : menu) {
                if (makanan.equalsIgnoreCase(cariMenu)) {
                    temukan = true;
                    break;
                }
            }
            if (temukan) {
                System.out.println("Makanan/minuman " + cariMenu + " tersedia didalam menu.");
            } else {
                System.out.println("Maaf, " + cariMenu + " tidak tersedia didalam menu. Silakan coba lagi.");
            }
        } while (!temukan);

        input.close();
    }
}