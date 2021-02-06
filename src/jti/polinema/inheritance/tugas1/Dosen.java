package jti.polinema.inheritance.tugas1;

public class Dosen extends Pegawai {

    private int jumlahSKS;
    private final int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return super.getGaji() + TARIF_SKS * jumlahSKS;
    }
}