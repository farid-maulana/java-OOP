package jti.polinema.overloadingoverriding;

public class Managers {
    protected String nama;
    protected int gaji;

    public Managers(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}