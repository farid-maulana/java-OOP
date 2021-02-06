package jti.polinema.classdanobject;

public class Lingkaran {
    public static double phi = 3.14;
    public double r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = phi * (2 * r);
        return keliling;
    }
}
