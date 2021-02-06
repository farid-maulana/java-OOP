package jti.polinema.classdanobject;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();

        lingkaran.r = 10;
        System.out.println("Jari - jari         : " + lingkaran.r);
        System.out.println("Luas lingkaran      : " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran  : " + lingkaran.hitungKeliling());
    }
}
