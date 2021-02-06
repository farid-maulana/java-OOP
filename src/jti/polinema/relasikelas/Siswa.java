package jti.polinema.relasikelas;

public class Siswa {
    private int noAbsen;
    private String nama;
    private Rapor rapor;

    public Siswa(int noAbsen, String nama) {
        this.noAbsen = noAbsen;
        this.nama = nama;
    }

    public boolean kenaikanKelas(Rapor rapor, int kelas) {
        return true;
    }

    public Rapor getRapor(int kelas, int sem) {
        return rapor;
    }

    public void isiRapor() {
        Rapor rapor = new Rapor();
    }
}
