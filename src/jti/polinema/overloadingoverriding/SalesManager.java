package jti.polinema.overloadingoverriding;

public class SalesManager extends Managers {
    private String departemen;

    public SalesManager(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}
