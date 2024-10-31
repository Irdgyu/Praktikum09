import java.util.Scanner;
public class Tugas206 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int totalBiaya = 0;
        int jumlahPesanan;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahPesanan = input6.nextInt();
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        input6.nextLine();

        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = input6.nextLine();
            
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = input6.nextInt();
            input6.nextLine(); 
        }
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\n--- Daftar Pesanan ---");
        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp." + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp." + totalBiaya);

        input6.close();
    }
}