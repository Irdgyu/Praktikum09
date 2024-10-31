import java.util.Scanner;

public class ArrayNilai06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilali akhir ke-" + i + " : ");
            nilaiAkhir[i] = input6.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
        input6.close();
    }
}