import java.util.Scanner;
public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input6.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int jumlahMhsLulus = 0, jumlahMhsTdkLulus = 0;
        double totalMhsLulus= 0, totalMhsTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input6.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i ++) {
            if (nilaiMhs[i] > 70) {
                totalMhsLulus += nilaiMhs[i];
                jumlahMhsLulus++;
            }
            else {
                totalMhsTdkLulus += nilaiMhs[i];
                jumlahMhsTdkLulus++;
            }
        }
        rata2Lulus = totalMhsLulus / jumlahMhsLulus;
        rata2TdkLulus = totalMhsTdkLulus / jumlahMhsTdkLulus;
        System.out.println("Rata-rata nilai : " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus : " + rata2TdkLulus) ;
    }
}