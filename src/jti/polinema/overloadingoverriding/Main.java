package jti.polinema.overloadingoverriding;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        manusia.bernafas();
        manusia.makan();

        dosen.makan();
        dosen.lembur();

        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
