package jti.polinema.classdanobject;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();

        brg1.kode = "212";
        brg1.namaBarang = "Kapak Wirosableng";
        brg1.hargaDasar = 212000;
        brg1.diskon = 20;
        brg1.tampilData();
    }
}
