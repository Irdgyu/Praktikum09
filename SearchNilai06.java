import java.util.Scanner;
public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang diinput: ");
        int banyakNilai = input6.nextInt();

        int[] arrNilai = new int[banyakNilai];
        int key = 90;
        int hasil = 0;
        boolean cari = false;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiwa ke-" + (i+1) + " : ");
            arrNilai[i] = input6.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = input6.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai yang dicari ketemu, " + key + " merupakan nilai mahasiswa ke-" + (hasil+1));
                break;
            }
        }
        if (cari == false) {
            System.out.println();
            System.out.println("Nilai tidak ketemu");
        }
    }
}