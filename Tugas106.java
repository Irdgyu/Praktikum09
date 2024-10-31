import java.util.Scanner;
public class Tugas106 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        double rata2;
        
        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = input6.nextInt();
        
        int[] nilaiMhs = new int[jumlahNilai];
        
        System.out.print("Masukkan nilai mahasiswa ke-1: ");
        nilaiMhs[0] = input6.nextInt();
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        int total = nilaiMhs[0];
        
        for (int i = 1; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = input6.nextInt();
            nilaiMhs[i] = nilai;
            total += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            else if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        rata2 = total / jumlahNilai;
    
        System.out.println("\n--- Hasil Pengolahan Nilai Mahasiswa ---");
        System.out.print("Daftar nilai mahasiswa: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (i == nilaiMhs.length - 1) {
                System.out.print(nilaiMhs[i] + ".");  
            } 
            else {
                System.out.print(nilaiMhs[i] + ", "); 
            }
        }

        System.out.println("\nNilai rata-rata mahasiswa: " + rata2);
        System.out.println("Nilai tertinggi mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa: " + nilaiTerendah);

        input6.close();
    }
}