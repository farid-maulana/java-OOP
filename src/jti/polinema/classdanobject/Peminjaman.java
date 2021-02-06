package jti.polinema.classdanobject;

public class Peminjaman {
    public int id;
    public String nama_member;
    public String nama_game;
    public int harga;

    public void tampilData() {
        System.out.println("ID          : " + id);
        System.out.println("Nama member : " + nama_member);
        System.out.println("Nama game   : " + nama_game);
        System.out.println("Harga       : " + harga);
    }

    public int hitungHarga(int lamaSewa) {
        int hargaSewa = lamaSewa * harga;
        return hargaSewa;
    }
}
