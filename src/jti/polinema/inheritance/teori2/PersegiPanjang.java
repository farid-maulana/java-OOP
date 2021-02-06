package jti.polinema.inheritance.teori2;

public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    @Override
    public float luas() {
        float luas = panjang * lebar;
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = 2*panjang + 2*lebar;
        return keliling;
    }
}
