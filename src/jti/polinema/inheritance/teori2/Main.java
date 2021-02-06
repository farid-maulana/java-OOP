package jti.polinema.inheritance.teori2;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10;
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
    }
}
