package jti.polinema.relasikelas;

public class Jurusan {
    private String namaJurusan;
    private Dosen dosen;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }
}
