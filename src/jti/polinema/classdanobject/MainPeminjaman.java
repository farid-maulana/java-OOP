package jti.polinema.classdanobject;

public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman peminjaman = new Peminjaman();
        
        peminjaman.id = 143;
        peminjaman.nama_member = "Ily";
        peminjaman.nama_game = "The Adventures";
        peminjaman.harga = 14300;
        peminjaman.tampilData();
        System.out.println("Harga sewa  : " + peminjaman.hitungHarga(5));
    }
}
