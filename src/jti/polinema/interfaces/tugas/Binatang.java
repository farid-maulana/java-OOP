package jti.polinema.interfaces.tugas;

public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public void displayBinatang() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Kaki: " + this.jmlKaki);
    }
}