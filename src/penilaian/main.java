package penilaian;


public class main {
    public static void main(String[] args) {
        
        NilaiAkhir teddy = new NilaiAkhir ("Teddy Kiswanto","2110010150",80,89,70);
        
        System.out.println("Nama Mahasiswa : "+teddy.getNama());
        System.out.println("Npm Mahasiswa  : "+teddy.getNpm());
        System.out.println("Nilai Akhir : "+teddy.hitungNilaiAkhir());
    }
}
