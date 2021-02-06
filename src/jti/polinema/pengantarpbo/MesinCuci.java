package jti.polinema.pengantarpbo;

public class MesinCuci {
    private String merk;
    private int dayaTampung;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDayaTampung(int dayaTampung) {
        this.dayaTampung = dayaTampung;
    }

    public void cetakStatus() {
        System.out.println("MESIN CUCI");
        System.out.println("Merk : " + merk);
        System.out.println("Daya Tampung : " + dayaTampung + " liter");
    }
}

