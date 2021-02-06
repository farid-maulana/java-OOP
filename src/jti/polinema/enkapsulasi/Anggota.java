package jti.polinema.enkapsulasi;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if (jumlahPinjaman > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman = jumlahPinjaman;
        }
    }

    public void angsur(int angsuran) {
        if (angsuran >= (10 * jumlahPinjaman / 100)) {
            jumlahPinjaman -= angsuran;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}
