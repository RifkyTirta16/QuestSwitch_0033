
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

        int pilihan = 0;
        double nilaiDipilih = 0;
        String namaMatkul = "";

        if (ipk >= 3.5) {
            System.out.println("Selamat! Anda memenuhi syarat untuk mendaftar Asisten Dosen.");
            System.out.println("Pilih mata kuliah yang ingin diajukan:");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
            System.out.print("Masukkan pilihan (1-5): ");
            pilihan = input.nextInt();
           

        }

        switch (pilihan) {
            case 1:
                namaMatkul = "Struktur Data";
                nilaiDipilih = strukturData;
                break;
            case 2:
                namaMatkul = "Pemrograman Berorientasi Objek";
                nilaiDipilih = pbo;
                break;
            case 3:
                namaMatkul = "Basis Data";
                nilaiDipilih = basisData;
                break;
            case 4:
                namaMatkul = "Algoritma dan Pemrograman";
                nilaiDipilih = algo;
                break;
            case 5:
                namaMatkul = "Rekayasa Perangkat Lunak";
                nilaiDipilih = rpl;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        if(nilaiDipilih >= 75){
            System.out.println("Anda diterima sebagai Asisten Dosen untuk mata kuliah " + namaMatkul + " dengan nilai " + nilaiDipilih);
        }else{
            System.out.println("Maaf, Anda tidak diterima sebagai Asisten Dosen untuk mata kuliah " + namaMatkul + " karena nilai Anda " + nilaiDipilih + " kurang dari 75.");
        }
    }
}