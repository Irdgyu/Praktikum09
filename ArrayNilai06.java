import java.util.Scanner;
public class ArrayNilai06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilali akhir ke-" + i + " : ");
            nilaiAkhir[i] = input6.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } 
            else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }
        input6.close();
    }
}