
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
    }
}