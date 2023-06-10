package pkg021_adlina_tugasakhirpertemuanpbo;

public class Main {
    
    public static void main(String[] args) {
        String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        System.out.println("Soal No 1." );
        System.out.println("String Awal : "+ awal);
        System.out.println("1." + awal.subSequence(0,36));
        System.out.println("2." + awal.subSequence(0,36).toString().toLowerCase());
        System.out.println("3." + awal.subSequence(0,36).toString().toUpperCase());
        System.out.println("4." + awal.subSequence(25,36));
        System.out.println("5." + awal.substring(37));
    }
}
