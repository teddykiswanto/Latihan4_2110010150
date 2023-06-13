package penilaian;

public class NilaiAkhir extends mahasiswa {
   int uts, uas, tugas;

    public NilaiAkhir(String nama,String npm, int uts, int uas, int tugas) {
        super.nama = nama;
        super.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
   public int hitungNilaiAkhir(){
       return (int)(0.3*uts + 0.3*uas + 0.4*tugas);
   }
}
