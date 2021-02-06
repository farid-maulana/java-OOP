package jti.polinema.classdanobject;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - (diskon / 100 * hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Dasar     : " + hargaDasar);
        System.out.println("Diskon          : " + diskon);
        System.out.println("Harga Jual      : " + hitungHargaJual());
    }
}
