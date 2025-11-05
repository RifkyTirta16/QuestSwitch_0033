
import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Struktur Data: ");
        double strukturData = input.nextDouble();

        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        double pbo = input.nextDouble();

        System.out.print("Masukkan nilai Basis Data: ");
        double basisData = input.nextDouble();

        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        double algo = input.nextDouble();

        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        double rpl = input.nextDouble();

        double total = strukturData + pbo + basisData + algo + rpl;
        double ratarata = total / 5;
        double ipk = ratarata / 100 * 4.0;

        String predikat;
        if (ipk >= 3.75){
            predikat = "A (Sangat Baik)";
        }else if (ipk >= 3.5){
            predikat = "AB (Baik)";
        }else if (ipk >= 3.0){
            predikat = "B (Cukup Baik)";
        }else if (ipk >= 2.5){
            predikat = "BC (Kurang Baik)";
        }else{
            predikat = "C (Buruk)";
        }
        System.out.println("Nilai Rata-rata: " + ratarata);
        System.out.println("IPK: " + ipk);
        System.out.println("Predikat: " + predikat);
    }
}