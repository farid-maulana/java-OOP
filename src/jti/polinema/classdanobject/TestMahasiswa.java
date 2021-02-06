package jti.polinema.classdanobject;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinola No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        mhs2.nim = 102;
        mhs2.nama = "Farlan";
        mhs2.alamat = "Jl. Wijaya";
        mhs2.kelas = "2F";
        mhs2.tampilBiodata();
        mhs3.nim = 103;
        mhs3.nama = "Chi";
        mhs3.alamat = "Jl. inAja";
        mhs3.kelas = "2B";
        mhs3.tampilBiodata();
    }
}
