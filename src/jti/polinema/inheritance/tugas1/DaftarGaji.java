package jti.polinema.inheritance.tugas1;

public class DaftarGaji {

    private Pegawai[] listPegawai;
    private int jumlah;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai p) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = p;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] != null) {
                System.out.println("Nama    : " + listPegawai[i].getNama());
                System.out.println("Gaji    : " + listPegawai[i].getGaji());
                System.out.println();
            }
        }
    }
}
