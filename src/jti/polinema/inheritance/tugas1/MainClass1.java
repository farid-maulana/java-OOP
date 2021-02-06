package jti.polinema.inheritance.tugas1;

public class MainClass1 {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("12345", "Farlan", "Malang");
        Dosen dosen1 = new Dosen("23456", "Chichi", "Malang");
        Dosen dosen2 = new Dosen("34567", "Chafid", "Sulfat");
        dosen1.setJumlahSKS(5);
        dosen2.setJumlahSKS(8);

        DaftarGaji dg = new DaftarGaji(5);
        dg.addPegawai(pegawai1);
        dg.addPegawai(dosen1);
        dg.addPegawai(dosen2);

        dg.printSemuaGaji();
    }
}
