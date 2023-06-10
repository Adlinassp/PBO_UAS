package tugas_akhir_pertemuan_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama , nim, matakuliah;
        char grade;
        final double  jml_hadir, n_kehadiran, n_uts , n_uas , n_akhir;
        
        System.out.println("===============================================================");
        System.out.println("|+-            Program Menghitung Nilai Mahasiswa           -+|");
        System.out.println("===============================================================");
        
        System.out.println("=========== Masukkan Data Mahasiswa terlebih Dahulu ===========");
        System.out.print("=  - Masukan nama        : ");
        nama = input.nextLine();
        System.out.print("=  - Masukan NIM         : ");
        nim = input.nextLine();
        System.out.print("=  - Masukan Mata Kuliah : ");
        matakuliah = input.nextLine();
        
        System.out.println("");
        System.out.println("=========== Masukkan Nilai Mahasiswa terlebih Dahulu ==========");
        System.out.print("=  - Input Jumlah Kehadiran (1-8) : ");
        jml_hadir = input.nextInt();
        
        if (jml_hadir >= 7){
            n_kehadiran = 100;
        }else if (jml_hadir >=5&& jml_hadir < 7){
            n_kehadiran = 80;
        }else if (jml_hadir >=3&& jml_hadir < 5){
            n_kehadiran = 60;
        } else {
            n_kehadiran = 0;
        }
        System.out.println("=  - Nilai Kehadiran Mahasiswa    : "+n_kehadiran);
        
        System.out.print("=  - Input Nilai UTS Mahasiswa    : ");
        n_uts = input.nextInt();
        System.out.print("=  - Input Nilai UAS Mahasiswa    : ");
        n_uas = input.nextInt();
        
        System.out.println("===============================================================");
        System.out.println("|+-         Hasil Perhitungan Nilai Akhir Mahasiswa         -+|");
        System.out.println("===============================================================");  
        
        n_akhir = (0.20*n_kehadiran +0.30 * n_uts + 0.50 * n_uas);
        
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 70 && n_akhir < 85){
            grade = 'B';
        }
        else if (n_akhir > 60 && n_akhir < 70){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 60){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            

        System.out.println("=  - "+nama+"\n=  - dengan NIM "+nim+"\n=  - Pada Matakuliah "+matakuliah+"\n=  - memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n=    dan dinyatakan LULUS");
        }
        else {
            System.out.println("=  - "+nama+"\n=  - dengan NIM "+nim+"\n=  - Pada Matakuliah "+matakuliah+"\n=  - memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n=    dan dinyatakan TIDAK LULUS");
        }  
    }
}
