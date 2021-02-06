package jti.polinema.pengantarpbo;

public class SepedaGunung extends Sepeda {
    private String tipeSusensi;

    public void setTipeSusensi(String tipeSusensi) {
        this.tipeSusensi = tipeSusensi;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi : " + tipeSusensi);
    }
}
